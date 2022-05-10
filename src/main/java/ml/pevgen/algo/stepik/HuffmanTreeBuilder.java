package ml.pevgen.algo.stepik;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class HuffmanTreeBuilder {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();//"abacabad";
        //String input = "abacabad";
        Map<String, Node> chars = buildTree(input);
        printResults(input, chars);
    }

    private static void printResults(String inputString, Map<String, Node> chars) {
        String stringResult = Arrays.stream(inputString.toLowerCase().split(""))
                .map(s -> chars.get(s).code)
                .collect(Collectors.joining());

        out.println(chars.size() + " " + stringResult.length());
        for (var entry : chars.entrySet()) {
            out.println(entry.getKey() + ": " + entry.getValue().code);
        }
        out.println(stringResult);
    }


    private static Map<String, Node> buildTree(String s) {
        Node result = null;
        Map<String, Long> map = Arrays.stream(
                        s.toLowerCase().split(""))
                .collect(
                        Collectors.groupingBy(c -> c, Collectors.counting()));

        PriorityQueue<Node> queue = new PriorityQueue<>();
        Map<String, Node> charNodes = new HashMap<>();

        for (var entry : map.entrySet()) {
            Node node = new Node(entry.getKey(), Math.toIntExact(entry.getValue()));
            queue.add(node);
            charNodes.put(entry.getKey(), node);
        }

        if (queue.size() == 1) {
            Node leftNode = queue.poll();
            Node levelUpNode = new Node(leftNode, null, leftNode.frequency);
            queue.add(levelUpNode);
        }

        while (!queue.isEmpty()) {
            Node leftNode = queue.poll();
            Node rightNode = queue.poll();

            if (rightNode == null) {
                result = leftNode;
                break;
            }

            Node levelUpNode = new Node(leftNode, rightNode, leftNode.frequency + rightNode.frequency);
            queue.add(levelUpNode);
        }

        result.createCode("");

        return charNodes;
    }


    private static class Node implements Comparable<Node> {
        String character;
        Integer frequency;
        Node leftNode;
        Node rightNode;
        String code;

        public void createCode(String code) {
            this.code = code;
            if (leftNode != null) {
                leftNode.createCode(code + "0");
            }
            if (rightNode != null) {
                rightNode.createCode(code + "1");
            }

        }


        public Node(String character, Integer frequency) {
            this.character = character;
            this.frequency = frequency;
        }

        public Node(Node leftNode, Node rightNode, Integer frequency) {
            this.leftNode = leftNode;
            this.rightNode = rightNode;
            this.frequency = frequency;
        }

        @Override
        public int compareTo(Node node) {
            return this.frequency.compareTo(node.frequency);
        }


    }
}

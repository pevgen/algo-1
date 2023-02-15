package ml.pevgen.algo.hackerrank.w1.d6;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <a href="https://www.hackerrank.com/challenges/bfsshortreach/problem">
 * https://www.hackerrank.com/challenges/bfsshortreach/problem</a>
 */
public class BreathSearchFirst {

    public List<Integer> bfs(int numberNodes, int numberEdges, List<List<Integer>> edges, int nodeStart) {

        Map<Integer, Node> nodes = buildGraph(edges);

        // search start node
        Node startNode = nodes.get(nodeStart);

        // check start node if it is included to the edges
        if (startNode == null) {
            return Stream
                    .generate(() -> -1)
                    .limit((numberNodes - 1))
                    .collect(Collectors.toList());
        }

        Set<Integer> usedNodes = countLevelsWithBreathFirstSearch(startNode);

        return buildResultList(numberNodes, nodeStart, nodes, usedNodes);
    }

    private static Set<Integer> countLevelsWithBreathFirstSearch(Node startNode) {
        // unique nodes (cycle protection)
        Set<Integer> usedNodes = new HashSet<>();
        usedNodes.add(startNode.value);
        // BFS
        Deque<Node> queue = new ArrayDeque<>();
        queue.offer(startNode);
        startNode.level = 0;

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            for (Node link : node.links) {
                if (usedNodes.contains(link.value)) {
                    continue;
                }
                link.level = node.level + 1;
                queue.offer(link);
                usedNodes.add(link.value);
            }
        }
        return usedNodes;
    }

    private static Map<Integer, Node> buildGraph(List<List<Integer>> edges) {
        Map<Integer, Node> nodes = new HashMap<>();
        for (List<Integer> edge : edges) {
            Node n1 = nodes.get(edge.get(0));
            if (n1 == null) {
                n1 = new Node(edge.get(0));
                nodes.put(n1.value, n1);
            }
            Node n2 = nodes.get(edge.get(1));
            if (n2 == null) {
                n2 = new Node(edge.get(1));
                nodes.put(n2.value, n2);
            }
            n1.links.add(n2);
            n2.links.add(n1);
        }
        return nodes;
    }

    private static ArrayList<Integer> buildResultList(int numberNodes, int nodeStart, Map<Integer, Node> nodes, Set<Integer> usedNodes) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 1; i <= numberNodes; i++) {
            if (i != nodeStart) {
                if (usedNodes.contains(i)) {
                    resultList.add(nodes.get(i).level * 6);
                } else {
                    resultList.add(-1);
                }
            }
        }
        return resultList;
    }


    static class Node {
        int value;
        List<Node> links = new ArrayList<>();
        int level = -1;

        public Node(int value) {
            this.value = value;
        }
    }
}

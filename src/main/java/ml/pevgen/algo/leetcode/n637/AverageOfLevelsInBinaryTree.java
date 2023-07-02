package ml.pevgen.algo.leetcode.n637;

import ml.pevgen.algo.leetcode.utils.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/average-of-levels-in-binary-tree/description/">
 * https://leetcode.com/problems/average-of-levels-in-binary-tree/description/</a>
 */
public class AverageOfLevelsInBinaryTree {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            // !!! main idea: we know the level size, as we poll all previous nodes on level, on the line 2
            int levelSize = queue.size();

            double levelSum = 0.0;

            for (int i = 0; i < levelSize; i++) {                 // line 2 :  poll all level nodes
                TreeNode currentNode = queue.poll();

                if (currentNode == null) {
                    break;
                }

                levelSum = levelSum + currentNode.val;

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }

            }

            result.add(levelSum / levelSize);
        }
        return result;
    }

    public List<Double> averageOfLevels_complex_solution(TreeNode root) {

        Queue<LeveledNode> queue = new ArrayDeque<>();
        queue.offer(new LeveledNode(root, 0));
        List<Pair> cntAndSums = new ArrayList<>();  // level, <nodes count, values sum>

        while (!queue.isEmpty()) {
            LeveledNode leveledNode = queue.poll();
            sumOneNode(leveledNode.node.val, leveledNode.level, cntAndSums);
            if (leveledNode.node.left != null) {
                queue.offer(new LeveledNode(leveledNode.node.left, leveledNode.level + 1));
            }
            if (leveledNode.node.right != null) {
                queue.offer(new LeveledNode(leveledNode.node.right, leveledNode.level + 1));
            }

        }

        List<Double> result = new ArrayList<>();
        for (Pair p : cntAndSums) {
            result.add(p.sum / p.cnt);
        }
        return result;
    }

    private static class LeveledNode {
        TreeNode node;
        int level;

        public LeveledNode(TreeNode node, int level) {
            this.node = node;
            this.level = level;
        }
    }

    private static class Pair {
        int cnt;
        double sum;

        public Pair(int cnt, double sum) {
            this.cnt = cnt;
            this.sum = sum;
        }
    }

    private void sumOneNode(int val, int level, List<Pair> cntAndSums) {

        if (cntAndSums.size() <= level) {
            cntAndSums.add(new Pair(0, 0));
        }
        Pair pair = cntAndSums.get(level);
        if (pair == null) {
            pair = new Pair(0, 0);
        }
        pair.cnt++;
        pair.sum += val;
    }

}

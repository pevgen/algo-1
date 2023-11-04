package ml.pevgen.algo.leetcode.n102;

import ml.pevgen.algo.leetcode.utils.TreeNode;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/binary-tree-level-order-traversal/">
 * https://leetcode.com/problems/binary-tree-level-order-traversal/</a>
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null) {
            return Collections.emptyList();
        }

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            queue = addOneLevel(queue, result);
        }
        return result;
    }

    private static Queue<TreeNode> addOneLevel(Queue<TreeNode> queue, List<List<Integer>> result) {
        Queue<TreeNode> newQueue = new LinkedList<>();
        List<Integer> currentList = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            currentList.add(node.val);
            if (node.left != null) {
                newQueue.offer(node.left);
            }
            if (node.right != null) {
                newQueue.offer(node.right);
            }
        }
        result.add(currentList);
        return newQueue;
    }
}

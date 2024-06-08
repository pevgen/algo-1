package ml.pevgen.algo.leetcode.n103;

import ml.pevgen.algo.leetcode.utils.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/">
 * https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/</a>
 */
public class BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        if (root == null) {
            return List.of();
        }

        Deque<TreeNode> level1 = new ArrayDeque<>();
        Deque<TreeNode> level2 = new ArrayDeque<>();
        boolean leftToRightDirection = true;
        level1.add(root);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        do {
            TreeNode node = level1.removeLast();
            row.add(node.val);
            if (leftToRightDirection) {
                if (node.left != null) {
                    level2.add(node.left);
                }
                if (node.right != null) {
                    level2.add(node.right);
                }
            } else {
                if (node.right != null) {
                    level2.add(node.right);
                }
                if (node.left != null) {
                    level2.add(node.left);
                }
            }

            if (level1.isEmpty()) {

                result.add(new ArrayList<>(row));
                row = new ArrayList<>();

                level1 = level2;
                level2 = new ArrayDeque<>();
                leftToRightDirection = !leftToRightDirection;
            }
        } while (!level1.isEmpty());

        return result;
    }
}

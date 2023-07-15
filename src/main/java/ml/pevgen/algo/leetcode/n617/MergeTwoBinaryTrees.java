package ml.pevgen.algo.leetcode.n617;

import ml.pevgen.algo.leetcode.utils.TreeNode;

/**
 * <a href="https://leetcode.com/problems/merge-two-binary-trees/">
 * https://leetcode.com/problems/merge-two-binary-trees/</a>
 */
public class MergeTwoBinaryTrees {

    public TreeNode mergeTrees(TreeNode node1, TreeNode node2) {

        if (node1 == null && node2 == null) {
            return null;
        }
        if (node2 == null) {
            return node1;
        }

        if (node1 == null) {
            return node2;
        }


        TreeNode leftPart = mergeTrees(node1.left, node2.left);
        if (leftPart != null) {
            node1.left = leftPart;
            node2.left = leftPart;
        }

        TreeNode rightPart = mergeTrees(node1.right, node2.right);
        if (rightPart != null) {
            node1.right = rightPart;
            node2.right = rightPart;
        }

        node1.val = node1.val + node2.val;
        node2.val = node1.val;

        return node2;
    }

}

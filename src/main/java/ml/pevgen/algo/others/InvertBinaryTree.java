package ml.pevgen.algo.others;

import ml.pevgen.algo.leetcode.utils.TreeNode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
      invert(root);
      return root;
    }

    public void invert(TreeNode node) {
        if (node == null || (node.left == null && node.right == null)) {
            return;
        }
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        invert(node.left);
        invert(node.right);
    }

}

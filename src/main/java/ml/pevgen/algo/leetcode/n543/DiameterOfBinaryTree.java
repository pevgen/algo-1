package ml.pevgen.algo.leetcode.n543;

import ml.pevgen.algo.leetcode.utils.TreeNode;

/**
 * <a href="https://leetcode.com/problems/diameter-of-binary-tree/description/">
 * https://leetcode.com/problems/diameter-of-binary-tree/description/</a>
 */
public class DiameterOfBinaryTree {

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int currentDiameter = depth(root.left) + depth(root.right);
        int maxDiameterIn = Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right));

        return Math.max(maxDiameterIn, currentDiameter);
    }

    public int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int maxDepthLeft = depth(node.left) + 1;
        int maxDepthRight = depth(node.right) + 1;
        return Math.max(maxDepthLeft, maxDepthRight);
    }

}

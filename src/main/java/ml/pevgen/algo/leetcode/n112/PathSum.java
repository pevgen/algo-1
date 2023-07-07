package ml.pevgen.algo.leetcode.n112;

import ml.pevgen.algo.leetcode.utils.TreeNode;

/**
 * <a href="https://leetcode.com/problems/path-sum/description/">
 * https://leetcode.com/problems/path-sum/description/</a>
 */
public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        return hasPathSum(root, 0, targetSum);
    }


    public boolean hasPathSum(TreeNode node, int currentSum, int targetSum) {
        int pathSum = currentSum + node.val;

        if (node.left == null && node.right == null) {
            return pathSum == targetSum;
        }

        boolean result = false;
        if (node.left != null) {
            result = hasPathSum(node.left, pathSum, targetSum);
        }
        if (result) {
            return true;
        } else if (node.right != null) {
            return hasPathSum(node.right, pathSum, targetSum);
        }
        return false;
    }
}

package ml.pevgen.algo.leetcode.n101;

import ml.pevgen.algo.leetcode.utils.TreeNode;

/**
 * <a href="https://leetcode.com/problems/symmetric-tree/description/">
 * https://leetcode.com/problems/symmetric-tree/description/</a>
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {

        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {

        if (left != null && right != null && left.val != right.val) {
            return false;
        }

        if (left != null && right == null) {
            return false;
        }

        if (left == null && right != null) {
            return false;
        }

        if (left == null && right == null) {
            return true;
        }

        // left, right not null and they are equal
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}

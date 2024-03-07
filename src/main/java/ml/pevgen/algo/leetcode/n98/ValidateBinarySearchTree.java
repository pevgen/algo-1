package ml.pevgen.algo.leetcode.n98;

import ml.pevgen.algo.leetcode.utils.TreeNode;

/**
 * <a href="https://leetcode.com/problems/validate-binary-search-tree/description/">
 * https://leetcode.com/problems/validate-binary-search-tree/description/</a>
 */
public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode localRoot, TreeNode minNode, TreeNode maxNode) {
        if (localRoot == null) {
            return true;
        }

        if ((minNode != null) && (localRoot.val <= minNode.val)) {
            return false;
        }
        if ((maxNode != null) && (localRoot.val >= maxNode.val)) {
            return false;
        }

        return isValidBST(localRoot.left, minNode, localRoot) &&
                isValidBST(localRoot.right, localRoot, maxNode);
    }


}

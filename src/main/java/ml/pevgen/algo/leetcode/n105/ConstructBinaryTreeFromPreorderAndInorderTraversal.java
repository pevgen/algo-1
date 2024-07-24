package ml.pevgen.algo.leetcode.n105;

import ml.pevgen.algo.leetcode.utils.TreeNode;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/">
 * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/</a>
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {  // O(N^2)
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }

        int rootVal = preorder[0];
        TreeNode root = new TreeNode(rootVal);
        if (preorder.length == 1 || inorder.length == 1) {
            return root;
        }

        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == rootVal) {
                root.left = buildTree(Arrays.copyOfRange(preorder, 1, i + 1), Arrays.copyOfRange(inorder, 0, i));
                root.right = buildTree(Arrays.copyOfRange(preorder, i + 1, preorder.length), Arrays.copyOfRange(inorder, i + 1, inorder.length));
                break;
            }
        }

        return root;
    }
}

package ml.pevgen.algo.leetcode.n110;

import ml.pevgen.algo.leetcode.utils.TreeNode;

/**
 * <a href="https://leetcode.com/problems/balanced-binary-tree/description/">
 * https://leetcode.com/problems/balanced-binary-tree/description/</a>
 *<br/>
 * Good explanation:
 * <a href="https://www.geeksforgeeks.org/how-to-determine-if-a-binary-tree-is-balanced/">
 *     https://www.geeksforgeeks.org/how-to-determine-if-a-binary-tree-is-balanced/</a>
 *
 *
 */
public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return myDeep(root) != -1;
    }

    int myDeep(TreeNode node) {

        if (node == null) {
            return 0;
        }

        int leftDeep = myDeep(node.left);
        if (leftDeep == -1) {
            return -1;
        }
        int rightDeep = myDeep(node.right);
        if (rightDeep == -1) {
            return -1;
        }

        if (Math.abs(leftDeep - rightDeep) > 1)
            return -1;
        else
            return Math.max(leftDeep, rightDeep) + 1;
    }
}

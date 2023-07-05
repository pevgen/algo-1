package ml.pevgen.algo.leetcode.n111;

import ml.pevgen.algo.leetcode.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/minimum-depth-of-binary-tree/description/">
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/description/</a>
 */
public class MinimumDepthOfBinaryTree {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            depth++;
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.remove();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                if (node.left == null && node.right == null) {
                    queue.clear();
                    break;
                }
            }
        }
        return depth;
    }
}

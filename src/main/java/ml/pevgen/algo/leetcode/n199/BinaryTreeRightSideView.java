package ml.pevgen.algo.leetcode.n199;

import ml.pevgen.algo.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/binary-tree-right-side-view/description/">
 * https://leetcode.com/problems/binary-tree-right-side-view/description/</a>
 */
public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<Integer> result = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            queue = calcOneLevel(queue, result);
        }
        return result;
    }

    private LinkedList<TreeNode> calcOneLevel(LinkedList<TreeNode> queue, List<Integer> result) {
        result.add(queue.getLast().val);
        LinkedList<TreeNode> nextLevel = new LinkedList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                nextLevel.offer(node.left);
            }
            if (node.right != null) {
                nextLevel.offer(node.right);
            }
        }
        return nextLevel;
    }
}

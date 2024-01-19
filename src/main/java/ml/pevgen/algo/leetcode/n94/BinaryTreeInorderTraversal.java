package ml.pevgen.algo.leetcode.n94;

import ml.pevgen.algo.leetcode.utils.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/binary-tree-inorder-traversal/description/">
 * https://leetcode.com/problems/binary-tree-inorder-traversal/description/</a>
 */
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {

            if (node != null) {
                stack.push(node);
                node = node.left;
                continue;
            }

            node = stack.pop();
            resultList.add(node.val);

            node = node.right;
        }
        return resultList;
    }


    @SuppressWarnings("java:S100")
    public List<Integer> inorderTraversal_recursive(TreeNode root) {
        if (root == null) {
            return List.of();
        }

        List<Integer> resultList = new ArrayList<>();
        traversal(root, resultList);
        return resultList;
    }

    private void traversal(TreeNode node, List<Integer> resultList) {
        if (node.left != null) {
            traversal(node.left, resultList);
        }
        resultList.add(node.val);
        if (node.right != null) {
            traversal(node.right, resultList);
        }
    }
}

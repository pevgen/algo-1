package ml.pevgen.algo.leetcode.n257;

import ml.pevgen.algo.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/binary-tree-paths/description/">
 * https://leetcode.com/problems/binary-tree-paths/description/</a>
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {

        LinkedList<TreeNode> stack = new LinkedList<>();
        List<String> result = new ArrayList<>();
        stack.push(root);
        search(root, stack, result);

        return result;
    }


    void search(TreeNode node, LinkedList<TreeNode> stack, List<String> result) {
        if (node.left == null && node.right == null) {
            result.add(buildPAthAsString(stack));
            return;
        }
        if (node.left != null) {
            stack.push(node.left);
            search(node.left, stack, result);
            stack.pop();
        }
        if (node.right != null) {
            stack.push(node.right);
            search(node.right, stack, result);
            stack.pop();
        }

    }

    String buildPAthAsString(LinkedList<TreeNode> stack) {
        StringBuilder sb = new StringBuilder();
        sb.append(stack.get(stack.size() - 1).val);
        for (int i = stack.size() - 2; i >= 0; i--) {
            sb.append("->").append(stack.get(i).val);
        }
        return sb.toString();
    }
}

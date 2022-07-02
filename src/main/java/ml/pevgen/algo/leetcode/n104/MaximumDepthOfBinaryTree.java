package ml.pevgen.algo.leetcode.n104;

import ml.pevgen.algo.leetcode.utils.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Maximum Depth of Binary Tree
 *
 * <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/">https://leetcode.com/problems/maximum-depth-of-binary-tree/</a>
 */
public class MaximumDepthOfBinaryTree {


    public static void main(String[] args) {

        System.out.println("test1 (expected: true) = " + new MaximumDepthOfBinaryTree().test0());
        System.out.println("test1 (expected: true) = " + new MaximumDepthOfBinaryTree().test1());
        System.out.println("test2 (expected: true) = " + new MaximumDepthOfBinaryTree().test2());
        System.out.println("test3 (expected: true) = " + new MaximumDepthOfBinaryTree().test3());
        System.out.println("test4 (expected: true) = " + new MaximumDepthOfBinaryTree().test4());
        System.out.println("test5 (expected: true) = " + new MaximumDepthOfBinaryTree().test5());
    }

    public boolean test0() {
        return 0 == maxDepth(null);
    }

    public boolean test1() {
        TreeNode root = new TreeNode(0);
        return 1 == maxDepth(root);
    }

    public boolean test2() {
        TreeNode root = new TreeNode(0, new TreeNode(1), null);
        return 2 == maxDepth(root);
    }

    public boolean test3() {
        TreeNode root = new TreeNode(0, new TreeNode(1), null);
        return 2 == maxDepth(root);
    }

    public boolean test4() {
        TreeNode root = new TreeNode(0, new TreeNode(1, new TreeNode(3), null), new TreeNode(2));
        return 3 == maxDepth(root);
    }

    public boolean test5() {
        TreeNode root = new TreeNode(0, new TreeNode(1, new TreeNode(3), null), new TreeNode(2));
        return 3 == maxDepth(root);
    }

    int maximumDepth = 0;

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        depth(root, stack);
        return maximumDepth;
    }

    public void depth(TreeNode node, Deque<TreeNode> stack) {
        if (node.getLeft() == null && node.getRight() == null) {
            if (stack.size() > maximumDepth) {
                maximumDepth = stack.size();
            }
            return;
        }
        if (node.getLeft() != null) {
            stack.push(node);
            depth(node.getLeft(), stack);
            stack.pop();
        }

        if (node.getRight() != null) {
            stack.push(node);
            depth(node.getRight(), stack);
            stack.pop();
        }

    }


}

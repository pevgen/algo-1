package ml.pevgen.algo.leetcode.n226;

import ml.pevgen.algo.leetcode.utils.TreeNode;

import java.util.LinkedList;

public class InvertBinaryTree {

    public static void main(String[] args) {
        new InvertBinaryTree().should_invert_only_two_nodes();
        new InvertBinaryTree().should_invert_six_nodes();
        new InvertBinaryTree().should_invert_imbalanced_nodes();

        new InvertBinaryTree().should_invert_recursive_only_two_nodes();
        new InvertBinaryTree().should_invert_recursive_six_nodes();
        new InvertBinaryTree().should_invert_recursive_imbalanced_nodes();

    }

    private void should_invert_imbalanced_nodes() {
        TreeNode root = new TreeNode(1, new TreeNode(2), null);
        root = invert(root);
        System.out.println("root.left (expected null)= " + root.getLeft());
        System.out.println("root.right val (expected 2)= " + root.getRight().getVal());
    }

    private void should_invert_six_nodes() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1), new TreeNode(3)),
                new TreeNode(7,
                        new TreeNode(6), new TreeNode(9)));
        root = invert(root);
        System.out.println("root.left val (expected 7)= " + root.getLeft().getVal());
        System.out.println("root.right val (expected 2)= " + root.getRight().getVal());

        System.out.println("root.left.left val (expected 9)= " + root.getLeft().getLeft().getVal());
        System.out.println("root.left.right val (expected 6)= " + root.getLeft().getRight().getVal());

        System.out.println("root.right.left val (expected 3)= " + root.getRight().getLeft().getVal());
        System.out.println("root.right.right val (expected 1)= " + root.getRight().getRight().getVal());

    }

    private void should_invert_only_two_nodes() {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        root = invert(root);
        System.out.println("root.left val (expected 3)= " + root.getLeft().getVal());
        System.out.println("root.right val (expected 1)= " + root.getRight().getVal());
    }

    private void should_invert_recursive_imbalanced_nodes() {
        TreeNode root = new TreeNode(1, new TreeNode(2), null);
        root = invert(root);
        System.out.println("root.left (expected null)= " + root.getLeft());
        System.out.println("root.right val (expected 2)= " + root.getRight().getVal());
    }

    private void should_invert_recursive_six_nodes() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1), new TreeNode(3)),
                new TreeNode(7,
                        new TreeNode(6), new TreeNode(9)));
        root = invert(root);
        System.out.println("root.left val (expected 7)= " + root.getLeft().getVal());
        System.out.println("root.right val (expected 2)= " + root.getRight().getVal());

        System.out.println("root.left.left val (expected 9)= " + root.getLeft().getLeft().getVal());
        System.out.println("root.left.right val (expected 6)= " + root.getLeft().getRight().getVal());

        System.out.println("root.right.left val (expected 3)= " + root.getRight().getLeft().getVal());
        System.out.println("root.right.right val (expected 1)= " + root.getRight().getRight().getVal());

    }

    private void should_invert_recursive_only_two_nodes() {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        root = invert(root);
        System.out.println("root.left val (expected 3)= " + root.getLeft().getVal());
        System.out.println("root.right val (expected 1)= " + root.getRight().getVal());
    }
    private TreeNode invertRecursive(TreeNode node) {
        if (node == null) {
            return null;
        }

        TreeNode right = invertRecursive(node.getRight());
        TreeNode left = invertRecursive(node.getLeft());
        node.setLeft(right);
        node.setRight(left);
        return node;
    }

    private TreeNode invert(TreeNode root) {
        if (root == null) {
            return null;
        }

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            TreeNode tempLeft = current.getLeft();
            current.setLeft(current.getRight());
            current.setRight(tempLeft);

            if (current.getLeft() != null) {
                queue.add(current.getLeft());
            }
            if (current.getRight() != null) {
                queue.add(current.getRight());
            }

        }
        return root;
    }
}

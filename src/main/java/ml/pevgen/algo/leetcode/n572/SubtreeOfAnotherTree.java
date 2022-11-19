package ml.pevgen.algo.leetcode.n572;

import ml.pevgen.algo.leetcode.utils.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * <a href="https://leetcode.com/problems/subtree-of-another-tree/">https://leetcode.com/problems/subtree-of-another-tree/</a>
 */
public class SubtreeOfAnotherTree {

    public static void main(String[] args) {
        new SubtreeOfAnotherTree().test_simple();
        new SubtreeOfAnotherTree().test_comparing_trees();
    }


    public void test_comparing_trees() {
        System.out.println("equals [true] : " +
                ifTreesEquals(new TreeNode(1), new TreeNode(1)));
        System.out.println("equals [false] : " +
                ifTreesEquals(new TreeNode(1), null));
        System.out.println("equals [false] : " +
                ifTreesEquals(null, new TreeNode(1)));
        System.out.println("equals [true] : " +
                ifTreesEquals(
                        new TreeNode(4,
                                new TreeNode(1),
                                new TreeNode(2)),
                        new TreeNode(4,
                                new TreeNode(1),
                                new TreeNode(2))));
        System.out.println("equals [false] : " +
                ifTreesEquals(
                        new TreeNode(4,
                                new TreeNode(1),
                                new TreeNode(2)),
                        new TreeNode(4,
                                new TreeNode(1,
                                        new TreeNode(0), null),
                                new TreeNode(2))));

    }

    public void test_simple() {
        System.out.println("expected [true] : " + isSubtree(new TreeNode(1), new TreeNode(1)));

        System.out.println("expected [false] : " +
                isSubtree(
                        new TreeNode(3,
                                new TreeNode(4,
                                        new TreeNode(1),
                                        new TreeNode(2)),
                                new TreeNode(5)),
                        new TreeNode(1,
                                new TreeNode(0),
                                null)));

        System.out.println("expected [true] : " +
                isSubtree(
                        new TreeNode(1,
                                new TreeNode(1),
                                null),
                        new TreeNode(1)));

    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        Deque<TreeNode> equalNodes = new LinkedList<>();
        Deque<TreeNode> treeNodes = new LinkedList<>();

        // search equals roots
        treeNodes.offer(root);

        while (!treeNodes.isEmpty()) {

            TreeNode one = treeNodes.poll();

            if (one.val == subRoot.val) {
                equalNodes.push(one);
            }

            if (one.left != null) {
                treeNodes.offer(one.left);
            }

            if (one.right != null) {
                treeNodes.offer(one.right);
            }

        }

        while (equalNodes.peek() != null) {
            if (ifTreesEquals(equalNodes.pop(), subRoot)) {
                return true;
            }
        }

        return false;
    }

    private boolean ifTreesEquals(TreeNode one, TreeNode subRoot) {
        if ((one == null) && (subRoot == null)) {
            return true;
        }

        if (one != null && subRoot == null) {
            return false;
        }

        if (one == null) {
            return false;
        }

        if (one.val != subRoot.val) {
            return false;
        }

        return ifTreesEquals(one.left, subRoot.left) && ifTreesEquals(one.right, subRoot.right);
    }
}

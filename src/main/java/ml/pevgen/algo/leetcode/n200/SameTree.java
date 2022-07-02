package ml.pevgen.algo.leetcode.n200;

import ml.pevgen.algo.leetcode.utils.TreeNode;

/**
 * Same Tree
 *
 * <a href="https://leetcode.com/problems/same-tree">https://leetcode.com/problems/same-tree</a>
 */
public class SameTree {

    public static void main(String[] args) {

        System.out.println("test1 (expected: true) = " + new SameTree().test1());
        System.out.println("test2 (expected: false) = " + new SameTree().test2());
        System.out.println("test3 (expected: true) = " + new SameTree().test3());
        System.out.println("test4 (expected: true) = " + new SameTree().test4());
        System.out.println("test5 (expected: false) = " + new SameTree().test5());
        System.out.println("test6 (expected: false) = " + new SameTree().test6());
    }

    public boolean test1() {
        TreeNode root1 = new TreeNode(0);
        TreeNode root2 = new TreeNode(0);
        return isSameTree(root1, root2);
    }

    public boolean test2() {
        TreeNode root1 = new TreeNode(0, new TreeNode(1), null);
        TreeNode root2 = new TreeNode(0, new TreeNode(2), null);
        return isSameTree(root1, root2);
    }

    public boolean test3() {
        TreeNode root1 = new TreeNode(0, new TreeNode(1), null);
        TreeNode root2 = new TreeNode(0, new TreeNode(1), null);
        return isSameTree(root1, root2);
    }

    public boolean test4() {
        TreeNode root1 = new TreeNode(0, new TreeNode(1, new TreeNode(3), null), new TreeNode(2));
        TreeNode root2 = new TreeNode(0, new TreeNode(1, new TreeNode(3), null), new TreeNode(2));
        return isSameTree(root1, root2);
    }

    public boolean test5() {
        TreeNode root1 = new TreeNode(0, new TreeNode(1, new TreeNode(3), null), new TreeNode(2));
        TreeNode root2 = new TreeNode(0, new TreeNode(1, new TreeNode(4), null), new TreeNode(2));
        return isSameTree(root1, root2);
    }

    public boolean test6() {
        TreeNode root1 = new TreeNode(0, new TreeNode(1), null);
        TreeNode root2 = new TreeNode(0, null, new TreeNode(1));
        return isSameTree(root1, root2);
    }


    public boolean isSameTree(TreeNode treeNode1, TreeNode treeNode2) {

        if ((treeNode1 == null) && (treeNode2 == null)) {
            return true;
        }

        if ((treeNode1 == null) || (treeNode2 == null)) {
            return false;
        }

        if (treeNode1.getVal() != treeNode2.getVal()) {
            return false;
        }
        return isSameTree(treeNode1.getLeft(), treeNode2.getLeft())
                && isSameTree(treeNode1.getRight(), treeNode2.getRight());
    }
}

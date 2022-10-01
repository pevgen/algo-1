package ml.pevgen.algo.leetcode.n235;

import ml.pevgen.algo.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * <a href="https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/">https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/</a>
 *
 * <a href="https://en.wikipedia.org/wiki/Lowest_common_ancestor">https://en.wikipedia.org/wiki/Lowest_common_ancestor</a>
 */
public class LowestCommonAncestorOfBinaryTree {

    public static void main(String[] args) {
        new LowestCommonAncestorOfBinaryTree().test_big_tree_1();
        new LowestCommonAncestorOfBinaryTree().test_small_tree();
        new LowestCommonAncestorOfBinaryTree().test_big_tree_2();

    }

    public void test_big_tree_2() {
        TreeNode root = new TreeNode(5,
                new TreeNode(3,
                        new TreeNode(2,
                                new TreeNode(1),
                                null
                                ), new TreeNode(4)),
                new TreeNode(6, null, null));

        TreeNode result = new LowestCommonAncestorOfBinaryTree()
                .lowestCommonAncestor(root, new TreeNode(1), new TreeNode(4));
        System.out.println("findLCA = " + result);
    }

    public void test_small_tree() {
        TreeNode root = new TreeNode(2,
                null,
                new TreeNode(3));

        TreeNode result = new LowestCommonAncestorOfBinaryTree()
                .lowestCommonAncestor(root, new TreeNode(2), new TreeNode(3));
        System.out.println("findLCA = " + result);
    }

    public void test_big_tree_1() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1), new TreeNode(3)),
                new TreeNode(7,
                        new TreeNode(6), new TreeNode(9)));

        TreeNode result = new LowestCommonAncestorOfBinaryTree()
                .lowestCommonAncestor(root, new TreeNode(2), new TreeNode(3));
        System.out.println("findLCA = " + result);
    }


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Deque<TreeNode> queue = new LinkedList<>();
        queue.push(root);
        TreeNode firstNode = searchNodeWithVal(queue, p.val);

        queue.clear();
        queue.push(root);
        TreeNode secondNode = searchNodeWithVal(queue, q.val);

        System.out.println("firstNode.val = " + firstNode.val);
        System.out.println("secondNode.val = " + secondNode.val);


        List<TreeNode> firstAncestors = allAncestors(root, firstNode);
        System.out.println("firstAncestors = " + firstAncestors);
        List<TreeNode> secondAncestors = allAncestors(root, secondNode);
        System.out.println("secondAncestors = " + secondAncestors);

        return findLCA(firstAncestors, secondAncestors);
    }

    private TreeNode findLCA(List<TreeNode> firstAncestors, List<TreeNode> secondAncestors) {

        for (int i = firstAncestors.size() -1; i >= 0; i--){
            if (secondAncestors.contains(firstAncestors.get(i))) {
                return firstAncestors.get(i);
            }
        }

        return null;
    }

    private List<TreeNode> allAncestors(TreeNode root, TreeNode node) {
        List<TreeNode> ancestors = new ArrayList<>();
        TreeNode currentNode = root;
        while (node != currentNode) {
            ancestors.add(currentNode);
            if (node.val <= currentNode.val) {
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }
        }
        ancestors.add(currentNode);
        return ancestors;
    }

    private TreeNode searchNodeWithVal(Deque<TreeNode> queue, int val) {
        TreeNode node = queue.poll();
        if (node == null) {
            return null;
        }
        while (node.val != val) {
            if (node.left!= null) {
                queue.offer(node.left);
            }
            if (node.right!= null) {
                queue.offer(node.right);
            }
            node = queue.poll();
            if (node == null) {
                return null;
            }
        }
        return node;
    }

}

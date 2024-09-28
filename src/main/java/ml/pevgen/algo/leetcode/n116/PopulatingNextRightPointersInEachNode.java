package ml.pevgen.algo.leetcode.n116;

import ml.pevgen.algo.leetcode.utils.Node;


/**
 * <a href="https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/">
 * https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/</a>
 */
public class PopulatingNextRightPointersInEachNode {

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        two(root.left, root.right);
        return root;
    }

    private void two(Node left, Node right) {
        if (left == null)
            return;
        left.next = right;
        two(left.left, left.right);
        two(right.left, right.right);
        two(left.right, right.left);
    }
}

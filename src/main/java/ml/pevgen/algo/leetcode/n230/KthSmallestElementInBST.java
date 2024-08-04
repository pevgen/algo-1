package ml.pevgen.algo.leetcode.n230;

import ml.pevgen.algo.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/kth-smallest-element-in-a-bst/">
 * https://leetcode.com/problems/kth-smallest-element-in-a-bst/</a>
 */
public class KthSmallestElementInBST {

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> vals = new ArrayList<>();
        inOrderedTreeTraversal(root, k, vals);
        return vals.get(vals.size() - 1);
    }


    private void inOrderedTreeTraversal(TreeNode node, int k, List<Integer> vals) {
        if (node.left != null) {
            inOrderedTreeTraversal(node.left, k, vals);
        }
        if (vals.size() == k) {
            return;
        }
        vals.add(node.val);
        if (vals.size() == k) {
            return;
        }
        if (node.right != null) {
            inOrderedTreeTraversal(node.right, k, vals);
        }
    }
}

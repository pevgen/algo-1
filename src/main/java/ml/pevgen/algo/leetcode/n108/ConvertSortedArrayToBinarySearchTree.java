package ml.pevgen.algo.leetcode.n108;

import ml.pevgen.algo.leetcode.utils.TreeNode;

/**
 * <a href="https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/">
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/</a>
 */
public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }

        int middle = (nums.length) / 2;
        TreeNode head = new TreeNode(nums[middle]);
        buildLeftSubTree(0, middle - 1, head, nums);
        buildRightSubTree(middle + 1, nums.length - 1, head, nums);
        return head;
    }

    private void buildLeftSubTree(int leftBorder, int middle, TreeNode currentNode, int[] nums) {
        if (leftBorder > middle) {
            return;
        }

        if (leftBorder == middle) {
            currentNode.left = new TreeNode(nums[leftBorder]);
            return;
        }

        if (leftBorder + 1 == middle) {
            currentNode.left =
                    new TreeNode(nums[middle],
                            new TreeNode(nums[leftBorder]),
                            null);
            return;
        }


        int newMiddle = leftBorder + (middle - leftBorder) / 2;
        TreeNode newHead = new TreeNode(nums[newMiddle]);
        currentNode.left = newHead;
        buildLeftSubTree(leftBorder, newMiddle - 1, newHead, nums);
        buildRightSubTree(newMiddle + 1, middle, newHead, nums);
    }

    private void buildRightSubTree(int middle, int rightBorder, TreeNode currentNode, int[] nums) {
        if (rightBorder < middle) {
            return;
        }

        if (rightBorder == middle) {
            currentNode.right = new TreeNode(nums[rightBorder]);
            return;
        }

        if (rightBorder - 1 == middle) {
            currentNode.right =
                    new TreeNode(nums[rightBorder],
                            new TreeNode(nums[middle]),
                            null);
            return;
        }

        int newMiddle = middle + (rightBorder - middle) / 2;
        TreeNode newHead = new TreeNode(nums[newMiddle]);
        currentNode.right = newHead;
        buildLeftSubTree(middle, newMiddle - 1, newHead, nums);
        buildRightSubTree(newMiddle + 1, rightBorder, newHead, nums);
    }

}

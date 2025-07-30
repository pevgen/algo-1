package ml.pevgen.algo.others;

import ml.pevgen.algo.leetcode.utils.TreeNode;

import java.util.Arrays;

public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {

        if (nums.length == 0) {
            return null;
        }

        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }

        int mid = nums.length / 2;
        TreeNode root = new TreeNode(nums[mid]);
        int[] newLeftArray = Arrays.copyOfRange(nums, 0, mid );
        int[] newRightArray = Arrays.copyOfRange(nums, mid + 1, nums.length);
        root.left = sortedArrayToBST(newLeftArray);
        root.right = sortedArrayToBST(newRightArray);
        return root;
    }

}

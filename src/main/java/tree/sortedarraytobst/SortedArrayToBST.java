package tree.sortedarraytobst;

import datastructure.TreeNode;

/**
 * Created by haozhexu on 1/21/16.
 */
public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode currentNode = new TreeNode(nums[mid]);
        currentNode.left = helper(nums, left, mid - 1);
        currentNode.right = helper(nums, mid + 1, right);
        return currentNode;
    }
}

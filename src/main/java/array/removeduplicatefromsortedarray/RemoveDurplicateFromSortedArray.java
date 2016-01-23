package array.removeduplicatefromsortedarray;

/**
 * Created by haozhexu on 1/23/16.
 * Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDurplicateFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int i = nums.length > 0 ? 1 : 0;
        for (int n : nums) {
            if (n > nums[i - 1]) {
                nums[i++] = n;
            }
        }
        return i;
    }
}

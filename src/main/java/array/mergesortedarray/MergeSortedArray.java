package array.mergesortedarray;

/**
 * Created by haozhexu on 1/23/16.
 * Problem Link: https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m , int[] nums2, int n) {
        if (!isValidCase(nums1, m, nums2, n)) {
            return;
        }
        int lastIdx1 = m - 1;
        int lastIdx2 = n - 1;
        int mergeIdx = m + n - 1;
        while (lastIdx1 > -1 && lastIdx2 > -1) {
            if (nums1[lastIdx1] > nums2[lastIdx2]) {
                nums1[mergeIdx--] = nums1[lastIdx1--];
            } else {
                nums1[mergeIdx--] = nums2[lastIdx2--];
            }
        }
        while (lastIdx2 > -1) {
            nums1[mergeIdx--] = nums2[lastIdx2--];
        }
    }

    private boolean isValidCase(int[] nums1, int m, int[] nums2, int n) {
        return !(nums1 == null || nums2 == null || nums1.length < (m + n));
    }
}

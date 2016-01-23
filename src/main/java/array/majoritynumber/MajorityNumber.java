package array.majoritynumber;

import java.util.Arrays;

/**
 * Created by haozhexu on 1/23/16.
 * Problem Link: https://leetcode.com/problems/majority-element/
 */
public class MajorityNumber {

    public int majorityNumber(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}

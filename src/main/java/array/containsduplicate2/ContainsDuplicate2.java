package array.containsduplicate2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by haozhexu on 1/23/16.
 * Problem Link: https://leetcode.com/problems/contains-duplicate-ii/
 */
public class ContainsDuplicate2 {
    public boolean containsDuplicate(int[] nums, int k) {
        if (!isValidCase(nums)) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int index = map.get(nums[i]);
                if (Math.abs(i - index) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }

    private boolean isValidCase(int[] nums) {
        return !(nums == null || nums.length == 0);
    }
}

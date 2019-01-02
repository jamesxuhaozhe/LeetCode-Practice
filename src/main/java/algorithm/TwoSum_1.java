package algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by haozhexu on 1/2/19.
 * <p/>
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p/>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p/>
 * Example:
 * <p/>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p/>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum_1 {
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("The input has some problem");
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }

        throw new IllegalArgumentException("Invald input");
    }

    public static int[] twoSumOptimized(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("Invalid input");
    }
}

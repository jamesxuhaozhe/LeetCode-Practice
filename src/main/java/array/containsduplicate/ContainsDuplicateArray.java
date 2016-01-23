package array.containsduplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by haozhexu on 1/23/16.
 * Problem Link: https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicateArray {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n)) {
                return true;
            }
        }
        return false;
    }
}

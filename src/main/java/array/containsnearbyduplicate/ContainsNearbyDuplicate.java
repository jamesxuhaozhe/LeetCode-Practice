package array.containsnearbyduplicate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by haozhexu on 1/21/16.
 */
public class ContainsNearbyDuplicate {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int lastIdx = map.get(nums[i]);
                if (Math.abs(i - lastIdx) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}

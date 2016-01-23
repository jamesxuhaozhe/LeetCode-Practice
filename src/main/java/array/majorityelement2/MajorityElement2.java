package array.majorityelement2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by haozhexu on 2/4/16.
 */
public class MajorityElement2 {

    public List<Integer> getMajorityElement2(int[] nums) {
        if (!isValidCase(nums)) {
            return Collections.EMPTY_LIST;
        }
        int[] candidate = new int[2];
        int[] count = new int[2];
        for (int num : nums) {
            if (num == candidate[0]) {
                count[0]++;
            } else if (num == candidate[1]) {
                count[1]++;
            } else if (count[0] == 0) {
                candidate[0] = num;
                count[0] = 1;
            } else if (count[1] == 0) {
                candidate[1] = num;
                count[1] = 1;
            } else {
                count[0]--;
                count[1]--;
            }
        }
        count[0] = count[1] = 0;
        for (int num : nums) {
            if (num == candidate[0]) {
                count[0]++;
            }
            if (num == candidate[1]) {
                count[1]++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < candidate.length; i++) {
            if (count[i] > nums.length / 3 && !result.contains(candidate[i])) {
                result.add(candidate[i]);
            }
        }
        return result;
    }

    private boolean isValidCase(int[] nums) {
        return !(nums == null || nums.length == 0);
    }
}

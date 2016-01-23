package array.majorityelement;

/**
 * Created by haozhexu on 2/4/16.
 */
public class MajorityElement {

    public int getMajorityElement(int[] nums) {
        if (!isValidCase(nums)) {
            return -1;
        }
        int candidate = 0;
        int count = 0;
        for (int num : nums) {
            if (candidate == num) {
                count++;
            } else if (count == 0) {
                candidate = num;
                count = 1;
            } else {
                count--;
            }
        }
        return candidate;
    }

    private boolean isValidCase(int[] nums) {
        return !(nums == null || nums.length == 0);
    }
}

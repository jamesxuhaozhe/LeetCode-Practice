package array.movezeros;

/**
 * Created by haozhexu on 1/23/16.
 * Problem Link: https://leetcode.com/problems/move-zeroes/
 */
public class MoveZeros {
    public void removeZeros(int[] nums) {
        if (!isValidCase(nums)) {
            return;
        }
        int i = 0;
        for (int n : nums) {
            if (n > 0) {
                nums[i++] = n;
            }
        }
        while (i < nums.length) {
            nums[i++] = 0;
        }
    }

    private boolean isValidCase(int[] nums) {
        return !(nums == null || nums.length == 0);
    }
}

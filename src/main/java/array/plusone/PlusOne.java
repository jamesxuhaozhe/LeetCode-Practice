package array.plusone;

/**
 * Created by haozhexu on 1/23/16.
 * Problem Link: https://leetcode.com/problems/plus-one/
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        if (!isValidCase(digits)) {
            return digits;
        }
        int carry = 1;
        for (int i = digits.length - 1; i > -1; i--) {
            int digit = (digits[i] + carry) % 10;
            carry = (digits[i] + carry) / 10;
            digits[i] = digit;
            if (carry == 0) {
                return digits;
            }
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }

    private boolean isValidCase(int[] nums) {
        return !(nums == null || nums.length == 0);
    }
}

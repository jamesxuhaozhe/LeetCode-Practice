package array.removeelementinplace;

/**
 * Created by haozhexu on 1/21/16.
 */
public class RemoveElementInPlace {

    public static void main(final String[] args) {
        int[] nums = new int[] {1, 2, 3, 5, 5, 8, 9, 5};
        int value = 5;
        System.out.println(new RemoveElementInPlace().removeElement(nums, value));
    }

    public int removeElement(int[] A, int elem) {
        int l = A.length;
        for (int i=0; i<l; i++) {
            if (A[i] == elem) {
                A[i--] = A[l-- -1];
            }
        }
        return l;
    }
}

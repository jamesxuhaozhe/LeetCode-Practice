package tree.uniquebinarysearchtree;

/**
 * Created by haozhexu on 1/19/16.
 */
public class UniqueBinarySearchTree {
    public int getUniqueBSTSize(int n) {
        int[] count = new int[n + 1];
        count[0] = count[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                count[i] += count[j] * count[i - j - 1];
            }
        }
        return count[n];
    }
}

package array.sumtotwohundred;

/**
 * Created by haozhexu on 2/29/16.
 */
public class SumToTwoHundred {

    public static void main (final String[] args) {
        int sum = 0;
        for (int i = 0; i < 200; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}

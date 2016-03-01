package array.sumtohundred;

/**
 * Created by haozhexu on 2/29/16.
 */
public class SumToOneHundred {

    public static void main (final String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}

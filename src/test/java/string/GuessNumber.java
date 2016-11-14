package string;

/**
 * Created by haozhexu on 10/24/16.
 */
public class GuessNumber extends Guess {

    public GuessNumber()
    {
    }

    public int guessNumber(int n) {
        return guessNumber(0, n);
    }

    private int guessNumber(int low, int high)
    {
        int mid = (low + high) / 2;
        while (guess(mid) != 0)
        {
            if (guess(mid) == -1)
            {
                low = mid + 1;
            }
            if (guess(mid) == 1)
            {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        return mid;
    }

}

class Demo
{
    public static void main(final String[] args)
    {
        GuessNumber guessNumber = new GuessNumber();

        System.out.print(guessNumber.guessNumber(10));

    }
}

class Guess
{
    private static final int ANS = 6;

    public Guess()
    {

    }

    public int guess(int n)
    {
        if (n > ANS)
        {
            return 1;
        }

        if (n < ANS)
        {
            return -1;
        }

        return 0;
    }
}

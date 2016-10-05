package string;

/**
 * Created by haozhexu on 10/4/16.
 */
public class DecodeWays
{
    public static void main(final String[] args)
    {
        System.out.print(new DecodeWays().numDecodings("0"));
    }

    private int numDecodings(String s)
    {
        if (s == null || s.equals(""))
        {
            return 0;
        }
        int prevPrev = 1;
        int prev = 1;

        for (int i = 0; i < s.length(); i++)
        {
            int cur = 0;
            int curInt = Integer.parseInt(s.substring(i, i + 1));
            if (curInt >= 1 && curInt <= 9)
            {
                cur += prev;
            }
            if (i > 0)
            {
                curInt = Integer.parseInt(s.substring(i - 1, i + 1));
                if (curInt <= 26 && curInt >= 10)
                {
                    cur += prevPrev;
                }
            }
            if (cur == 0)
            {
                // if until this point, cur is still 0, it means the original string contains some character which is not number.
                // bad input!!
                return 0;
            }
            prevPrev = prev;
            prev = cur;
        }

        return prev;
    }
}

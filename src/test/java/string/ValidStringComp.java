package string;

/**
 * Created by haozhexu on 10/25/16.
 */
public class ValidStringComp {
    public static void main(final String[] args)
    {
        ValidStringComp comp = new ValidStringComp();
        System.out.print(comp.validWordAbbreviation("bignumberhahaha",
                "999999999"));
    }
    public boolean validWordAbbreviation(String word, String abbr) {
        if (word == null && abbr == null)
        {
            return true;
        }
        else if (word == null || abbr == null)
        {
            return false;
        }

        if (word.equals("") && abbr.equals(""))
        {
            return true;
        }
        else if (word.equals("") || abbr.equals(""))
        {
            return false;
        }

        String compare = getCompare(abbr, word);
        if (word.length() != compare.length())
        {
            return false;
        }

        for (int i = 0; i < word.length(); i++)
        {
            if (compare.charAt(i) != '_')
            {
                if (word.charAt(i) != compare.charAt(i))
                {
                    return false;
                }
            }
        }
        return true;

    }

    private static String getCompare(String abbr, String word)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < abbr.length(); i++)
        {
            char ch = abbr.charAt(i);
            if (Character.isDigit(ch))
            {
                if (ch == '0')
                {
                    return "";
                }
                int j = i;
                while (j < abbr.length() && Character.isDigit(abbr.charAt(j)))
                {
                    j++;
                }
                int nums = Integer.parseInt(abbr.substring(i, j));
                if (nums > word.length())
                {
                    return "";
                }
                for (int p = 0; p < nums; p++)
                {
                    sb.append("_");
                }
                i = j - 1;
            }
            else
            {
                sb.append(ch + "");
            }
        }
        return sb.toString();
    }
}

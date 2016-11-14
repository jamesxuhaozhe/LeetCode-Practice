package string;

/**
 * Created by haozhexu on 10/24/16.
 */
public class DecodeString {
    private static final String LEFT_BRACKET = "[";

    private static final String RIGHT_BRACKET = "]";

    public static void main(final String[] args) {
        System.out.print(algo("3[a]2[bc]"));
    }

    private static String algo(String stringToDecode) {
        if (stringToDecode == null || stringToDecode.equals(""))
        {
            return null;
        }
        int lastIdxOfLeftBracket = 0;
        int lastIdxOfRightBracket = 0;
        for (int i = 0; i < stringToDecode.length(); i++)
        {
            if (stringToDecode.charAt(i) == '[')
            {
                lastIdxOfLeftBracket = i;
            }
        }

        if (lastIdxOfLeftBracket == 0)
        {
            return stringToDecode;
        }

        for (int i = lastIdxOfLeftBracket + 1; i < stringToDecode.length(); i++)
        {
            if (stringToDecode.charAt(i) == ']')
            {
                lastIdxOfRightBracket = i;
                break;
            }
        }

        int numIdx = 0;
        for (int i = lastIdxOfLeftBracket - 1; i > -1; i--)
        {
            if (!Character.isDigit(stringToDecode.charAt(i)))
            {
                numIdx = i;
                break;
            }
        }
        if (numIdx > 0)
        {
            numIdx++;
        }

        String prev = stringToDecode.substring(0, numIdx);
        String mid = helper(stringToDecode.substring(numIdx, lastIdxOfRightBracket + 1));
        String next = stringToDecode.substring(lastIdxOfRightBracket + 1, stringToDecode.length());
        return algo(prev + mid + next);
    }

    /**
     * example string will look something like 3[ab]
     * @param str
     * @return
     */
    private static String helper(String str) {
        int leftIdx = str.indexOf(LEFT_BRACKET);
        int rightIdx = str.indexOf(RIGHT_BRACKET);
        int num = Integer.valueOf(str.substring(0, leftIdx));
        String stuff = str.substring(leftIdx + 1, rightIdx);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append(stuff);
        }
        return sb.toString();
    }
}

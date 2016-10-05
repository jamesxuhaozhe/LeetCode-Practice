package string;

import java.util.*;


/**
 * Created by haozhexu on 10/3/16.
 */
public class WordLadder
{
    public static void main(final String[] args)
    {
        Set<String> dict = new HashSet<>(Arrays.asList("hot", "dot", "dog", "lot", "log"));
        String start = "hit";
        String end = "cog";
        System.out.println(new WordLadder().ladderLength(start, end, dict));
    }

    public int ladderLength(String start, String end, Set<String> dict)
    {
        if (dict == null || dict.isEmpty())
        {
            return 0;
        }

        if (start.equals(end))
        {
            return 1;
        }

        dict.add(start);
        dict.add(end);

        Set<String> hash = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        hash.add(start);
        queue.offer(start);

        int length = 1;
        while (!queue.isEmpty())
        {
            length++;
            int size = queue.size();
            for (int i = 0; i < size; i++)
            {
                String word = queue.poll();
                for (String nextWord : getNextWord(word, dict))
                {
                    if (hash.contains(nextWord))
                    {
                        continue;
                    }
                    if (nextWord.equals(end))
                    {
                        return length;
                    }
                    hash.add(nextWord);
                    queue.offer(nextWord);
                }
            }
        }

        return 0;
    }

    private List<String> getNextWord(String word, Set<String> dict)
    {
        List<String> results = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++)
        {
            for (int i = 0; i < word.length(); i++)
            {
                if (c == word.charAt(i))
                {
                    continue;
                }

                String relatedWord = replaceWord(word, i, c);
                if (dict.contains(relatedWord))
                {
                    results.add(relatedWord);
                }
            }
        }
        return results;
    }

    private String replaceWord(String word, int i, char c)
    {
        char[] chars = word.toCharArray();
        chars[i] = c;
        return new String(chars);
    }
}

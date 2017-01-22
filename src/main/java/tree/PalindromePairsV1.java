package tree;

import java.util.*;

/**
 * Created by haozhexu on 1/21/17.
 */
public class PalindromePairsV1 {

    public static void main(final String[] args) {
        List<String> words = Arrays.asList("abcd", "dcba", "lls", "s", "sssll");
        List<List<Integer>> result = doWork(words);
        System.out.print(result);
    }

    private static List<List<Integer>> doWork(List<String> words) {
        List<List<Integer>> results = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.size(); j++) {
                if (i != j
                        && isPalindromePair(words.get(i) + words.get(j))
                        && !set.contains(Integer.toString(i) + Integer.toString(j))) {
                    results.add(Arrays.asList(i, j));
                    set.add(Integer.toString(i) + Integer.toString(j));
                }
            }
        }

        return results;
    }

    private static boolean isPalindromePair(String str) {
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

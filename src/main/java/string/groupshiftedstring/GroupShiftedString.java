package string.groupshiftedstring;

import java.util.*;

/**
 * Created by haozhexu on 3/2/16.
 */
public class GroupShiftedString {

    public static void main(final String[] args) {
        String[] list = new String[] {"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"};
        System.out.println(new GroupShiftedString().groupStrings(list));
    }

    private List<List<String>> groupStrings(String[] strings) {
        List<List<String>> result = new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strings) {
            int offset = str.charAt(0) - 'a';
            String key = "";
            for (int i = 0; i < str.length(); i++) {
                char c = (char) (str.charAt(i) - offset);
                if (c < 'a') {
                    c += 26;
                }
                key += c;
            }
            if (!map.containsKey(key)) {
                List<String> list = new ArrayList<String>();
                map.put(key, list);
            }
            map.get(key).add(str);
        }
        for (String key : map.keySet()) {
            List<String> list = map.get(key);
            Collections.sort(list);
            result.add(list);
        }
        return result;
    }
}

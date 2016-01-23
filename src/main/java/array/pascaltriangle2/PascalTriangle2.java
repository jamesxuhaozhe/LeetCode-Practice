package array.pascaltriangle2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by haozhexu on 1/23/16.
 * Problem Link: https://leetcode.com/problems/pascals-triangle-ii/
 */
public class PascalTriangle2 {
    public List<Integer> generate(int rowIndex) {
        if (!isValidCase(rowIndex)) {
            return Collections.EMPTY_LIST;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < rowIndex + 1; i++) {
            result.add(1);
            for (int j = i - 1; j > 0; j--) {
                result.set(j, result.get(j - 1) + result.get(j));
            }
        }
        return result;
    }

    private boolean isValidCase(int rowIndex) {
        return !(rowIndex < 0);
    }
}

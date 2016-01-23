package array.pascalstriangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by haozhexu on 1/23/16.
 * Problem Link: https://leetcode.com/problems/pascals-triangle/
 */
public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        if (!isValidCase(numRows)) {
            return Collections.EMPTY_LIST;
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(row);
        }
        return result;
    }

    private boolean isValidCase(int numRows) {
        return !(numRows < 1);
    }
}

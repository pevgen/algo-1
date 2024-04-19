package ml.pevgen.algo.leetcode.n118;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/pascals-triangle/description/">
 * https://leetcode.com/problems/pascals-triangle/description/</a>
 */
public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> resultList = new ArrayList<>();

        resultList.add(List.of(1));
        if (numRows == 1) {
            return resultList;
        }
        resultList.add(List.of(1, 1));
        if (numRows == 2) {
            return resultList;
        }

        List<Integer> prevRow = resultList.get(1);
        for (int i = 2; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j) + prevRow.get(j - 1));
            }
            row.add(1);
            resultList.add(row);
            prevRow = row;
        }
        return resultList;
    }

}

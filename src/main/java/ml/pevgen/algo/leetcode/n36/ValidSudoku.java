package ml.pevgen.algo.leetcode.n36;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/valid-sudoku/description/">
 * https://leetcode.com/problems/valid-sudoku/description/</a>
 */
public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        int len = 9;

        Map<Integer, Set<Integer>> colSets = new HashMap<>();
        Map<Integer, Set<Integer>> squareSets = new HashMap<>();

        for (int row = 0; row < len; row++) {

            int squareIndexRow = row / 3;

            Set<Integer> rowSet = new HashSet<>();
            for (int col = 0; col < len; col++) {
                if (board[row][col] == '.') {
                    continue;
                }

                int val = Integer.parseInt(String.valueOf(board[row][col]));
                if (rowSet.contains(val)) {
                    return false;
                }
                rowSet.add(val);

                if (isDuplicate(val, col, colSets)) {
                    return false;
                }

                int squareIndex = squareIndexRow * 10 + col / 3;

                if (isDuplicate(val, squareIndex, squareSets)) {
                    return false;
                }
            }
        }

        return true;
    }


    boolean isDuplicate(Integer val, Integer index, Map<Integer, Set<Integer>> mapOfSet) {
        mapOfSet.computeIfAbsent(index, k -> new HashSet<>());

        if (mapOfSet.get(index).contains(val)) {
            return true;
        }
        mapOfSet.get(index).add(val);

        return false;
    }
}

package ml.pevgen.algo.leetcode.n171;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/excel-sheet-column-number/">
 * https://leetcode.com/problems/excel-sheet-column-number/</a>
 */
public class ExcelSheetColumnNumber {

    private static final Map<Character, Integer> LETTERS =
            new HashMap<>();

    static {
        LETTERS.put('A', 1);
        LETTERS.put('B', 2);
        LETTERS.put('C', 3);
        LETTERS.put('D', 4);
        LETTERS.put('E', 5);
        LETTERS.put('F', 6);
        LETTERS.put('G', 7);
        LETTERS.put('H', 8);
        LETTERS.put('I', 9);
        LETTERS.put('J', 10);
        LETTERS.put('K', 11);
        LETTERS.put('L', 12);
        LETTERS.put('M', 13);
        LETTERS.put('N', 14);
        LETTERS.put('O', 15);
        LETTERS.put('P', 16);
        LETTERS.put('Q', 17);
        LETTERS.put('R', 18);
        LETTERS.put('S', 19);
        LETTERS.put('T', 20);
        LETTERS.put('U', 21);
        LETTERS.put('V', 22);
        LETTERS.put('W', 23);
        LETTERS.put('X', 24);
        LETTERS.put('Y', 25);
        LETTERS.put('Z', 26);
    }


    public int titleToNumber(String columnTitle) {
        double result = 0;
        int BASE = 26;
        for (int i = columnTitle.length() - 1, j = 0; i >= 0; i--, j++) {
            result = result + LETTERS.get(columnTitle.charAt(i)) * Math.pow(BASE, j);
        }
        return (int) result;
    }

}

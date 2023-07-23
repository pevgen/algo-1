package ml.pevgen.algo.leetcode.n844;

/**
 * <a href="https://leetcode.com/problems/backspace-string-compare/">
 * https://leetcode.com/problems/backspace-string-compare/</a>
 */
public class BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
        int p1 = s.length() - 1;
        int p2 = t.length() - 1;

        boolean result = true;
        while (p1 >= 0 || p2 >= 0) {
            p1 = backspaceIfNeed(s, p1);
            p2 = backspaceIfNeed(t, p2);
            if (((p1 >= 0 && p2 >= 0) && (t.charAt(p2) != s.charAt(p1)))
                    || (p1 < 0 && p2 >= 0) || (p1 >= 0 && p2 < 0)) {
                result = false;
                break;
            }

            p1--;
            p2--;
        }


        return result;
    }

    public int backspaceIfNeed(String string, int pointer) {
        if (pointer < 0) {
            return pointer;
        }

        if (string.charAt(pointer) != '#') {
            return pointer;
        }

        int backspaceCnt = 0;
        do {
            if (string.charAt(pointer) == '#') {
                backspaceCnt++;
            } else {
                backspaceCnt--;
            }
            pointer--;
        } while ((pointer >= 0 && backspaceCnt > 0) || (pointer >= 0 && string.charAt(pointer) == '#'));

        return pointer;
    }

}

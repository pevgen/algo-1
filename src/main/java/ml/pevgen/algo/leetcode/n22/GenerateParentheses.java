package ml.pevgen.algo.leetcode.n22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/generate-parentheses/description/">
 * https://leetcode.com/problems/generate-parentheses/description/</a>
 */
public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        LinkedList<String> parenthesisStack = new LinkedList<>();
        int openP = 0;
        int closedP = 0;

        buildStringByBacktrack(n, openP, closedP, parenthesisStack, result);

        return result;
    }

    private static void buildStringByBacktrack(int n, int openP, int closedP, LinkedList<String> parenthesisStack, List<String> result) {
        if ((openP == n) && (openP == closedP)) {
            List<String> copy = new ArrayList<>(parenthesisStack);
            Collections.reverse(copy);
            String currentString = String.join("", copy);
            result.add(currentString);
            return;
        }

        if (openP < n) {
            parenthesisStack.push("(");
            openP++;
            buildStringByBacktrack(n, openP, closedP, parenthesisStack, result);
            parenthesisStack.pop();
            openP--;
        }

        if (closedP < openP) {
            parenthesisStack.push(")");
            closedP++;
            buildStringByBacktrack(n, openP, closedP, parenthesisStack, result);
            parenthesisStack.pop();
        }

    }
}

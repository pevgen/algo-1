package ml.pevgen.algo.leetcode.n27;

import java.util.ArrayDeque;
import java.util.Deque;

import static java.lang.System.out;

/**
 * leetcode N27
 * * <a href="https://leetcode.com/problems/valid-parentheses/">https://leetcode.com/problems/valid-parentheses/</a>
 */
public class ValidParentheses {

    public static void main(String[] args) {
        out.println(validation("()"));
        out.println(validation("(){}"));
        out.println(validation("()[]{}"));
        out.println(validation("{{}[][[[]]]}"));
        out.println(validation("(]"));
        out.println(validation("["));
        out.println(validation("]"));
    }

    private static boolean validation(String s) {
        Deque<Character> characterStack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char cc = s.charAt(i);
            switch (cc) {
                case '(':
                case '{':
                case '[':
                    characterStack.push(cc);
                    break;
                case ')':
                    if (characterStack.isEmpty() || characterStack.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (characterStack.isEmpty() || characterStack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (characterStack.isEmpty() || characterStack.pop() != '[') {
                        return false;
                    }
                    break;
                default:
                    return false;
            }

        }
        return characterStack.isEmpty();
    }

}

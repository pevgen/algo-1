package ml.pevgen.algo.stepik;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * <a href="https://stepik.org/lesson/13238/step/11/">https://stepik.org/lesson/13238/step/11</a>
 *
 * The main idea - greedy algorithm on the last step:
 * last summond - 0<= lastSummond <= (n - previous sum)
 *
 * 3 = 1 + 2
 * 4 = 1 + 3
 * 5 = 1 + 4
 * 6 = 1 + 2 + 3
 * ...
 * 9 = 1 + 2 + 6
 */
public class UniqueSummands {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
       // int n = 2;

        out.println(findSequence(n));
    }

    private static String findSequence(int n) {
        if (n == 1 || n == 2) {
            return "1\n" + n;
        }

        int sum = 0;
        Deque<Integer> summondsDeque = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {

            if (n - sum < i) {   // find last summond
                summondsDeque.pop();
                sum = sum - (i - 1);
                int lastSummond = 0;
                for (int j = i; j < n; j++) {
                    if ((sum + j) == n) {
                        lastSummond = j;
                        break;
                    }
                }
                summondsDeque.push(lastSummond);
                break;
            }
            sum = sum + i;
            summondsDeque.push(i);
            if (n == sum) {
                break;
            }
        }

        StringBuilder result = new StringBuilder()
                .append(summondsDeque.size())
                .append("\n");
        while (!summondsDeque.isEmpty()) {
            result
                    .append(summondsDeque.removeLast())
                    .append(" ");
        }
        return result.toString();
    }
}

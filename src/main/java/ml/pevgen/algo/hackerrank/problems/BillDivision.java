package ml.pevgen.algo.hackerrank.problems;

import java.util.List;

/**
 * <a href="https://www.hackerrank.com/challenges/bon-appetit/problem">
 * https://www.hackerrank.com/challenges/bon-appetit/problem</a>
 */
public class BillDivision {

    public String bonAppetit(List<Integer> bill, int k, int b) {
        int numberOfItems = bill.size();
        int sum = 0;
        for (int i = 0; i < numberOfItems; i++) {
            if (i != k) {
                sum = sum + bill.get(i);
            }
        }
        if (sum / 2 == b) {
            System.out.println("Bon Appetit");
            return "Bon Appetit";
        } else {
            System.out.println(b - sum / 2);
            return "" + (b - sum / 2);
        }

    }
}

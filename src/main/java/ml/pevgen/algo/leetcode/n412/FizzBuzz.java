package ml.pevgen.algo.leetcode.n412;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/fizz-buzz/">
 * https://leetcode.com/problems/fizz-buzz/</a>
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> resultList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                resultList.add("FizzBuzz");
            } else if (i % 3 == 0) {
                resultList.add("Fizz");
            } else if (i % 5 == 0) {
                resultList.add("Buzz");
            } else {
                resultList.add(String.valueOf(i));
            }
        }
        return resultList;
    }
}

package ml.pevgen.algo.hackerrank.w1.d6;

import java.util.List;
import java.util.PriorityQueue;

/**
 * <a href="https://www.hackerrank.com/challenges/jesse-and-cookies/problem">
 * https://www.hackerrank.com/challenges/jesse-and-cookies/problem</a>
 */
public class JesseAndCookies {

    public int cookies(int k, List<Integer> list) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(list);
        int result = 0;
        while (pq.size() > 1) {
            Integer a = pq.poll();
            Integer b = pq.poll();

            if (a > k) {
                break;
            }

            pq.offer(a + b * 2);
            result++;
        }

        if ((pq.size() == 1) && (pq.peek() < k)) {
            return -1;
        } else {
            return result;
        }
    }

}

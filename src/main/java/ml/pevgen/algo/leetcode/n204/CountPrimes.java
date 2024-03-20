package ml.pevgen.algo.leetcode.n204;

/**
 * <a href="https://leetcode.com/problems/count-primes/description/">
 * https://leetcode.com/problems/count-primes/description/</a>
 * <p>
 * Hints: Use Sieve of Eratosthenes (Решето Эратосфена)
 * <p>
 * (eng) <a href="https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes">
 * https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes</a>
 * <p>
 * (ru) <a href="https://cneerc.ifmo.ru/wiki/index.php?title=%D0%A0%D0%B5%D1%88%D0%B5%D1%82%D0%BE_%D0%AD%D1%80%D0%B0%D1%82%D0%BE%D1%81%D1%84%D0%B5%D0%BD%D0%B0">
 * https://neerc.ifmo.ru/wiki/index.php?title=%D0%A0%D0%B5%D1%88%D0%B5%D1%82%D0%BE_%D0%AD%D1%80%D0%B0%D1%82%D0%BE%D1%81%D1%84%D0%B5%D0%BD%D0%B0</a>
 */
public class CountPrimes {

    public int countPrimes(int n) {
        if (n < 2) {
            return 0;
        }

        int[] numArr = new int[n + 1];
        for (int num = 2; num < n; num++) {
            if (numArr[num] == 0) {
                for (int i = 2; (num * (i)) < n; i++) {
                    numArr[num * (i)] = 1;
                }
            }
        }

        int result = 0;
        for (int i = 2; i < n; i++) {
            if (numArr[i] == 0) {
                result++;
            }
        }
        return result;
    }
}

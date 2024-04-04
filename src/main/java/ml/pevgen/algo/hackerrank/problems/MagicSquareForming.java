package ml.pevgen.algo.hackerrank.problems;

import java.util.List;

/**
 * <a href="https://www.hackerrank.com/challenges/magic-square-forming/problem?isFullScreen=true">
 * https://www.hackerrank.com/challenges/magic-square-forming/problem?isFullScreen=true</a>
 */
public class MagicSquareForming {

  /*
  The rules (3 x 3)
  The magic constant is 15
  A magic square always has the number 5 at the very center of it
  Even numbers should be on the squares.
  Odd numbers are on the edges.
  A detailed explanation about the topic can be found here https://mindyourdecisions.com/blog/2015/11/08/how-many-3x3-magic-squares-are-there-sunday-puzzle/
     */

    static int[][][] all8MagicSquares =
            new int[][][]{
                    {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
                    {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
                    {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
                    {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
                    {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
                    {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
                    {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                    {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}
            };

    public int formingMagicSquare(List<List<Integer>> square) {
        int minCost = Integer.MAX_VALUE;
        for (int[][] all8MagicSquare : all8MagicSquares) {
            int tempCost = 0;
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    tempCost = tempCost + (Math.abs(all8MagicSquare[j][k] - square.get(j).get(k)));
                }
            }

            if (tempCost < minCost) {
                minCost = tempCost;
            }
        }
        return minCost;
    }
}

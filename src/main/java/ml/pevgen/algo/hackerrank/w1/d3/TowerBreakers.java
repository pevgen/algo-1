package ml.pevgen.algo.hackerrank.w1.d3;

/**
 * Good explanation:
 * <a href="https://www.youtube.com/watch?v=jOxTTE3IkjE">
 * https://www.youtube.com/watch?v=jOxTTE3IkjE</a>
 */
public class TowerBreakers {

    public int towerBreakers(int towerNumbers, int towersHeight) {
        final int firstPlayerWin = 1;
        final int secondPlayerWin = 2;

        if (towersHeight == 1) {
            return secondPlayerWin;
        }

        if (towerNumbers == 1) {
            return firstPlayerWin;
        }

        if (towerNumbers % 2 == 0) {
            return secondPlayerWin;
        } else {
            return firstPlayerWin;
        }
    }
}

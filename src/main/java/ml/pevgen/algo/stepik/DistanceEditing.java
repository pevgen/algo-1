package ml.pevgen.algo.stepik;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * Distance Editing (Расстояние редактирования Левенштейна)
 * Алгоритм Вагнера-Фишера
 * <p>
 * Task: <a href="https://stepik.org/lesson/13258/step/8?unit=3443">https://stepik.org/lesson/13258/step/8?unit=3443</a>
 * <p>
 * Good example: <a href="https://stepik.org/lesson/13258/step/5?unit=3443">https://stepik.org/lesson/13258/step/5?unit=3443</a>
 */
public class DistanceEditing {


    //ab
    //ab
    // res = 0

    //short
    //ports
    // res = 3


    public static void main(String[] args) {
        Scanner s = new Scanner(in);
        String s1 = s.next();
        String s2 = s.next();

        System.out.println(calcDistance(s1, s2));
    }

    private static int calcDistance(String s1, String s2) {
        int[][] distance = new int[s1.length() + 1][s2.length() + 1];

        int m = distance.length;
        int n = distance[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    distance[i][j] = j;
                } else if (j == 0) {
                    distance[i][j] = i;
                } else {
                    int d1 = distance[i-1][j] + 1;
                    int d2 = distance[i][j-1] + 1;
                    int d3 = distance[i-1][j-1];
                    if (s1.charAt(i-1) != s2.charAt(j-1)) {
                        d3++;
                    }
                    distance[i][j] = Math.min(Math.min(d1, d2),d3);
                }


            }
        }
//
//        for (int[] arr : distance) {
//            System.out.println(Arrays.toString(arr));
//        }
        return distance[distance.length - 1][distance[0].length - 1];
    }
}

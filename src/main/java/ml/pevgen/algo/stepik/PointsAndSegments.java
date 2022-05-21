package ml.pevgen.algo.stepik;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Задача на программирование: точки и отрезки
 *
 * <a href="https://stepik.org/lesson/%D0%91%D1%8B%D1%81%D1%82%D1%80%D0%B0%D1%8F-%D1%81%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0-13249/step/6">https://stepik.org/lesson/%D0%91%D1%8B%D1%81%D1%82%D1%80%D0%B0%D1%8F-%D1%81%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0-13249/step/6</a>
 *
 * Алгоритм
 * 1. Заведите массив Х с началами отрезков и отсортируйте быстрой сортировкой
 * 2. Повторите шаг 1 для концов отрезков - массив У
 * 3. Напишите 2 функции для искомой точки А:
 *   1-я будет искать в массиве Х все элементы, которые меньше или равны(!) А и возвращать их количество N
 *   2-я будет искать в массиве У все элементы, которые строго (!) меньше А и возвращать их количество M
 * 4.  В цикле прогоните каждую точку из списка через обе функции -  ответом будет разность N - M
 *
 */
public class PointsAndSegments {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int segmentSize = s.nextInt();
        int pointSize = s.nextInt();

        int[] segmentsStart = new int[segmentSize];
        int[] segmentsEnd = new int[segmentSize];
        for (int i = 0; i < segmentSize; i++) {
            segmentsStart[i] = s.nextInt();
            segmentsEnd[i] = s.nextInt();
        }
        Arrays.sort(segmentsStart);
        Arrays.sort(segmentsEnd);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pointSize; i++) {
            int p = s.nextInt();
            // starts
            int plusPoints = plusPoints(segmentsStart, p);
            // ends
            int minusPoints = minusPoints(segmentsEnd, p);
            sb.append(plusPoints - minusPoints).append(" ");
        }
        out.println(sb);
    }

    public static int plusPoints(int[] segmentsStart, int point) {
        int res = Arrays.binarySearch(segmentsStart, point);
        if (res == -1) {
            return 0;
        }

        if (res >= 0) {
            for (int i = res + 1; i < segmentsStart.length; i++) {
                if (segmentsStart[i] == point) {
                    res++;
                } else {
                    break;
                }
            }
            return res + 1;
        }

        return -res - 1;
    }

    public static int minusPoints(int[] segmentsEnd, int point) {
        int res = Arrays.binarySearch(segmentsEnd, point);
        if (res == -1) {
            return 0;
        }

        if (res >= 0) {
            for (int i = res - 1; i >= 0; i--) {
                if (segmentsEnd[i] == point) {
                    res--;
                } else {
                    break;
                }
            }
            return Math.max(0, res);
        }

        return -res - 1;
    }


//    private static int plusPoints2(int[] x, int a) {
//        return plusPoints2(x, a, 0, x.length);
//    }
//
//    private static int plusPoints2(int[] x, int a, int low, int high) {
//        int n = x.length;
//        if (n == 0) return 0;
//
//        if (a < x[low]) return low;
//        if (a > x[high - 1]) return high;
//
//        for (;;) {
//            if (low + 1 == high) {
//                return low + 1;
//            }
//
//            int mid = low + (high - low) / 2;
//            if (a < x[mid]) high = mid;
//            else low = mid;
//        }
//    }
//
//    private static int minusPoints2(int[] y, int a) {
//        return minusPoints2(y, a, 0, y.length);
//    }
//
//    private static int minusPoints2(int[] y, int a, int low, int high) {
//        int n = y.length;
//        if (n == 0) return 0;
//
//        if (a < y[low]) return low;
//        if (a > y[high - 1]) return high;
//
//        for (;;) {
//            if (low + 1 == high) {
//                return a == y[low] ? low : (low + 1);
//            }
//
//            int mid = low + (high - low) / 2;
//            if (a <= y[mid]) high = mid;
//            else low = mid;
//        }
//    }
}

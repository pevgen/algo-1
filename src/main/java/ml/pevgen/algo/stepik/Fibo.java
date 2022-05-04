package ml.pevgen.algo.stepik;

import java.util.Scanner;

public class Fibo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //s.nextLong()

        int n = 10;
        int m = 2;

        int a = 0;
        int b = 1;

        for (int i = 1; i < n; i++) {
            int c = a + b;
            a = b % 10;
            b = c % 10;
        }

        System.out.println(b % m);
    }
}

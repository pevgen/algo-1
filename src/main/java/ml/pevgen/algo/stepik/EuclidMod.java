package ml.pevgen.algo.stepik;

import java.util.Scanner;

public class EuclidMod {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 18; //s.nextInt(); //14159572;//
        int b = 35; //s.nextInt(); //63967072;//
        int result;

        if (a == 0) {
            result = b;
        }
        if (b == 0) {
            result = a;
        }

        do {
            int r = 0;
            if (a > b) {
                r = a % b;
            } else {
                r = b % a;
            }

            if (r == 0) {
                result = Math.min(a, b);
                break;
            } else {
                a = Math.min(a, b);
                b = r;
            }


        } while (true);


        System.out.println(result);
    }


}

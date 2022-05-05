package ml.pevgen.algo.book.ch1;

import static java.lang.System.out;

public class Point13 {

    public static void main(String[] args) {
        out.println(func("Mr John Smith   ", 13));
    }

    private static String func(String s, int cnt) {

        StringBuilder sb = new StringBuilder();
        s = s.trim();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == " ".charAt(0)) {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}

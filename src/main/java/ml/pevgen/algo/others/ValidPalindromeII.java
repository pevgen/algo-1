package ml.pevgen.algo.others;

public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int p1 = 0;
        int p2 = s.length() - 1;

        while (p1 <= p2) {
            if (s.charAt(p1) != s.charAt(p2)) {
                return valid(s.substring(p1, p2)) || valid(s.substring(p1+1, p2+1));
            }
            p1++;
            p2--;
        }
        return true;
    }

    private boolean valid(String s){
        if (s == null || s.isEmpty()) {
            return true;
        }
        int p1 = 0;
        int p2 = s.length() - 1;

        while (p1 <= p2) {
            if (s.charAt(p1) != s.charAt(p2)) {
                return false;
            }
            p1++;
            p2--;
        }
        return true;
    }
}

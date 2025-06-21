package ml.pevgen.algo.others;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        if (s.length() == t.length()) {
            return s.equals(t);
        }
        if (s.isEmpty()) {
            return true;
        }


        int pS = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(pS) == t.charAt(i)) {
                pS++;
                if (pS == s.length()) {
                    return true;
                }
            }
        }

        return false;
    }
}

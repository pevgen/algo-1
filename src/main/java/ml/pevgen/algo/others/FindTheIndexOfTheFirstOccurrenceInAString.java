package ml.pevgen.algo.others;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                var firstChar = i;
                boolean found = true;
                for (int j = 1; j < needle.length(); j++) {
                    i++;
                    if (i >= haystack.length() || haystack.charAt(i) != needle.charAt(j)) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    return firstChar;
                }
                i = firstChar;
            }
        }
        return -1;
    }
}

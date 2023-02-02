package ml.pevgen.algo.hackerrank.w1.d3;

public class CaesarCipher {

    public String caesarCipher(String initString, int k) {
        int alphabetLength = 26;
        k = k%26;
        StringBuilder result = new StringBuilder();

        char[] charArray = initString.toCharArray();
        for (char c : charArray) {
            if (Character.isAlphabetic(c)) {
                boolean isUpperCase = false;
                if (Character.isUpperCase(c)) {
                    isUpperCase = true;
                    c = Character.toLowerCase(c);
                }

                char encryptedChar;
                if (c + k <= 'z') {
                    encryptedChar = (char) (c + k);
                } else {
                    encryptedChar = (char) (c + k - alphabetLength);
                }
                result.append(isUpperCase ? Character.toUpperCase(encryptedChar): encryptedChar);
            } else {
                result.append(c);
            }

        }
        return result.toString();
    }

}

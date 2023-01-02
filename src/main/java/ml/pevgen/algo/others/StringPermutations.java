package ml.pevgen.algo.others;

public class StringPermutations {


    /**
     * @param inputString - base input string
     * @param prefix      - accumulated string
     */
    public void combine(String inputString, String prefix) {

        if (inputString.isEmpty()) {
            System.out.println(prefix);
        }

        for (int i = 0; i < inputString.length(); i++) {
            String currentChar = inputString.substring(i, i + 1);
            String newInputString = inputString.replace(currentChar, "");
            String newPrefix = prefix + currentChar;
            combine(newInputString, newPrefix);
        }


    }
}

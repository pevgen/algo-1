package ml.pevgen.algo.algo1.permutations;

import java.util.ArrayList;
import java.util.List;

public class CharPermutations {

    public List<String> transposeChars(String inStr) {
        ArrayList<String> result = new ArrayList<>();
        process("", inStr, result);
        return result;
    }

    private void process(String prefix, String inStr, ArrayList<String> result) {


        if (inStr.length() == 1) {
            result.add(prefix + inStr);
            return;
        }

        for (int i = 0; i < inStr.length(); i++) {
            String newStr = inStr.replace(String.valueOf(inStr.charAt(i)), "");
            process(prefix + inStr.charAt(i), newStr, result);
        }

    }


}

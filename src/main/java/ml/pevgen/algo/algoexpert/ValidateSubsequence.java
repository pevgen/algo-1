package ml.pevgen.algo.algoexpert;

import java.util.List;

/**
 * <a href="https://www.algoexpert.io/questions/validate-subsequence">
 *     https://www.algoexpert.io/questions/validate-subsequence</a>
 */
public class ValidateSubsequence {

    public boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrIndex = 0;
        int seqIndex = 0;
        while (arrIndex < array.size() && seqIndex < sequence.size()) {
            for (int i = seqIndex; i < sequence.size(); i++) {
                if (array.get(arrIndex).equals(sequence.get(i))) {
                    seqIndex++;
                    break;
                }
            }
            arrIndex++;
        }
        return seqIndex == sequence.size();
    }


}


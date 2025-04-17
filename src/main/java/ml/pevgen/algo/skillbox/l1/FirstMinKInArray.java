package ml.pevgen.algo.skillbox.l1;

public class FirstMinKInArray {

    public int[] findFirstMinK(int[] input, int k)  {
        int[] result = new int[k];
        int prevMin = Integer.MIN_VALUE;
        for (int i =0; i< k; i++) {
            prevMin = minGreaterThan(input, prevMin);
            result[i] = prevMin;
        }
        return result;
    }

    private int minGreaterThan(int[] input, int prevMin) {
        int currentMin = Integer.MAX_VALUE;
        for (int num: input){
            if (num < currentMin && num > prevMin) {
                currentMin = num;
            }
        }
        return currentMin;
    }

}

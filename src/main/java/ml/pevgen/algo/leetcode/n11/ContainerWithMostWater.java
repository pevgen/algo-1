package ml.pevgen.algo.leetcode.n11;

/**
 * <a href="https://leetcode.com/problems/container-with-most-water/">
 * https://leetcode.com/problems/container-with-most-water/</a>
 */
public class ContainerWithMostWater {

    /**
     * Working case. Time complexity - O(N)
     */
    public int maxArea(int[] height) {

        if ((height == null) || (height.length < 2)) {
            return 0;
        }

        int leftIndex = 0;
        int rightIndex = height.length - 1;
        int result = 0;

        while (rightIndex > leftIndex) {
            int lowest = Math.min(height[leftIndex], height[rightIndex]);
            int area = lowest * (rightIndex - leftIndex);
            if (result < area) {
                result = area;
            }

            if (lowest == height[leftIndex]) {
                leftIndex++;
            }
            if (lowest == height[rightIndex]) {
                rightIndex--;
            }
        }

        return result;
    }

    /**
     * Working case. Time complexity - O(N2)
     * Not work in leetcode (time limit exceeded)
     */
    public int maxAreaNSquared(int[] height) {

        if ((height == null) || (height.length < 2)) {
            return 0;
        }
        int result = 0;
        for (int leftIndex = 0; leftIndex < height.length - 1; leftIndex++) {

            for (int rightIndex = leftIndex + 1; rightIndex < height.length; rightIndex++) {
                int lowest = Math.min(height[leftIndex], height[rightIndex]);
                int area = lowest * (rightIndex - leftIndex);
                if (result < area) {
                    result = area;
                }
            }
        }

        return result;
    }

}

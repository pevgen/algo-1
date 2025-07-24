package ml.pevgen.algo.others;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoArraysIITest {

    private final IntersectionOfTwoArraysII solution = new IntersectionOfTwoArraysII();

    @Test
    void testBasicIntersection() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = solution.intersect(nums1, nums2);
        Arrays.sort(result);
        assertArrayEquals(new int[]{2, 2}, result);
    }

    @Test
    void testDifferentSizes() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] result = solution.intersect(nums1, nums2);
        Arrays.sort(result);
        assertArrayEquals(new int[]{4, 9}, result);
    }

    @Test
    void testNoIntersection() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6};
        int[] result = solution.intersect(nums1, nums2);
        assertEquals(0, result.length);
    }

    @Test
    void testEmptyArrays() {
        int[] nums1 = {};
        int[] nums2 = {1, 2, 3};
        int[] result = solution.intersect(nums1, nums2);
        assertEquals(0, result.length);
        
        result = solution.intersect(new int[]{1, 2, 3}, new int[]{});
        assertEquals(0, result.length);
    }

    @Test
    void testIdenticalArrays() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 2, 3};
        int[] result = solution.intersect(nums1, nums2);
        Arrays.sort(result);
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    void testDuplicates() {
        int[] nums1 = {1, 1, 1, 2, 2};
        int[] nums2 = {1, 1, 2, 2, 2};
        int[] result = solution.intersect(nums1, nums2);
        Arrays.sort(result);
        assertArrayEquals(new int[]{1, 1, 2, 2}, result);
    }
}
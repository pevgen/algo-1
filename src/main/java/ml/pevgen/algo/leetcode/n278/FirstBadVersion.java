package ml.pevgen.algo.leetcode.n278;

/**
 * <a href="https://leetcode.com/problems/first-bad-version/">
 * https://leetcode.com/problems/first-bad-version/</a>
 */
public class FirstBadVersion {

    private final int badVersion;

    public FirstBadVersion(int badVersion) {
        this.badVersion = badVersion;
    }

    public int firstBadVersion(int n) {

        if (n == 1) {
            return isBadVersion(n) ? 1 : 0;
        }

        int left = 0;
        int right = n;

        while (right > left) {

            if (left == right - 1) {
                return right;
            }

            int middle = left + (right - left) / 2;

            if (isBadVersion(middle)) {
                right = middle;
            } else {
                left = middle;
            }

        }

        return 0;

    }

    private boolean isBadVersion(int currentVersion) {
        return currentVersion >= badVersion;
    }


}

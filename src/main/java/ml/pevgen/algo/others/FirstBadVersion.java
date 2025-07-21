package ml.pevgen.algo.others;

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

        while (left < right) {

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

        return left;
    }

    protected boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}

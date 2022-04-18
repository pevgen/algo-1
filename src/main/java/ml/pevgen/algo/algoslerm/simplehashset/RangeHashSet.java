package ml.pevgen.algo.algoslerm.simplehashset;

import java.util.ArrayList;

import static java.util.Objects.*;

public class RangeHashSet {

    private static final int RANGE_SIZE = 16;
    private final ArrayList<Integer>[] keys = new ArrayList[RANGE_SIZE];

    private int size = 0;

    public Integer put(Integer key) {
        requireNonNull(key, "Key couldn't be null");
        int bucket = getBucket(key);
        if (keys[bucket] == null) {
            keys[bucket] = new ArrayList<>();
        }
        keys[bucket].add(key);
        size++;
        return key;
    }

    public Integer remove(Integer key) {
        requireNonNull(key, "Key couldn't be null");
        int bucket = getBucket(key);
        ArrayList<Integer> keyList = keys[bucket];
        if (nonNull(keyList)) {
            if (keyList.remove(key)) {
                size--;
            }
            if (keyList.isEmpty()) {
                keys[bucket] = null;
            }
        }
        return key;
    }

    public boolean contains(Integer key) {
        if (isNull(key)) {
            return false;
        }
        int bucket = getBucket(key);
        ArrayList<Integer> keyList = keys[bucket];
        if (isNull(keyList)) {
            return false;
        }
        return keyList.contains(key);
    }


    public int getSize() {
        return size;
    }

    private int getBucket(Integer key) {
        return key % RANGE_SIZE;
    }

}

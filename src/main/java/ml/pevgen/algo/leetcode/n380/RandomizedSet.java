package ml.pevgen.algo.leetcode.n380;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/insert-delete-getrandom-o1/">
 * https://leetcode.com/problems/insert-delete-getrandom-o1/</a>
 * ------------
 * Each function works in average O(1) time complexity.
 * ------------
 * bool insert(int val) Inserts an item val into the set if not present.Returns true if the item was not present, false otherwise.
 * ---
 * bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false otherwise.
 * ---
 * int getRandom() Returns a random element from the current set of elements
 * (it's guaranteed that at least one element exists when this method is called).
 * Each element must have the same probability of being returned.
 */
public class RandomizedSet {

    public static final Random RAND = new Random();

    /**
     * key - value from input
     * value - index in the index list, for getting element from list by index
     */
    private final Map<Integer, Integer> storageMap = new HashMap<>();
    private final List<Integer> indexList = new ArrayList<>();

    public boolean insert(int val) {
        if (storageMap.containsKey(val)) {
            return false;
        }
        indexList.add(val);
        storageMap.put(val, indexList.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!storageMap.containsKey(val)) {
            return false;
        }
        int index = storageMap.get(val);

        // replace "removed element" with "last element" from the list
        indexList.set(index, indexList.get(indexList.size() - 1));
        // put/replace value (link to the indexList value) for element from indexList
        storageMap.put(indexList.get(index), index);

        // cut list
        indexList.remove(indexList.size() - 1);
        storageMap.remove(val);
        return true;
    }

    public int getRandom() {
        if (!storageMap.isEmpty()) {
            return indexList.get(RAND.nextInt(indexList.size()));
        }
        return -1;
    }
}

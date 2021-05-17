package ml.pevgen.algo.algo1.connectivity;

import java.util.stream.IntStream;

public interface Connectivity {

    /**
     * Component identifier for node.
     *
     * @param nodeId node
     * @return component identifier for node
     */
    int find(int nodeId);

    /**
     * Return true if node 1 and node 2 are in the same component.
     *
     * @param nodeId1 node 1
     * @param nodeId2 node 2
     * @return true, if nodes are connected
     */
    boolean connected(int nodeId1, int nodeId2);

    /**
     * Add connection between node 1 and node 2.
     *
     * @param nodeId1 node 1
     * @param nodeId2 node 2
     */
    void union(int nodeId1, int nodeId2);

    /**
     * Init array with no connectivity values
     * @param size - array size
     * @return - no connectivity array of ints (array[i] = i)
     */
    default int[] initNoConnectivityArray(int size) {
        return IntStream
                .range(0, size)
                .toArray();
    }

}

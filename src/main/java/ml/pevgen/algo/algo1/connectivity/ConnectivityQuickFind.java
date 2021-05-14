package ml.pevgen.algo.algo1.connectivity;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * Implement the simplest algorithm: nodes connected if id[p] is equal to id[q]
 */
public class ConnectivityQuickFind implements Connectivity {

    private final int[] id;

    public ConnectivityQuickFind(int size) {
        // random connectivity
        this.id = IntStream
                .generate(() -> new Random().nextInt(size))
                .limit(size)
                .toArray();
    }

    @Override
    public int find(int nodeId) {
        return id[nodeId];
    }

    @Override
    public boolean connected(int nodeId1, int nodeId2) {
        return id[nodeId1] == id[nodeId2];
    }

    @Override
    public void union(int nodeId1, int nodeId2) {
        if (!connected(nodeId1, nodeId2)) {
            int connectedId1 = find(nodeId1);
            int connectedId2 = find(nodeId2);
            for (var i = 0; i < id.length; i++) {
                if (connectedId2 == id[i]) {
                    id[i] = connectedId1;
                }
            }
        }
    }
}

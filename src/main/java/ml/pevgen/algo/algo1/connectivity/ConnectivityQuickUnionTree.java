package ml.pevgen.algo.algo1.connectivity;

public class ConnectivityQuickUnionTree implements Connectivity {

    private final int[] id;

    public ConnectivityQuickUnionTree(int size) {
        this.id = initNoConnectivityArray(size);
    }

    @Override
    public int find(int nodeId) {
        while (id[nodeId] != nodeId) {
            nodeId = id[nodeId];
        }
        return nodeId;
    }

    @Override
    public boolean connected(int nodeId1, int nodeId2) {
        return find(nodeId1) == find(nodeId2);
    }

    @Override
    public void union(int nodeId1, int nodeId2) {
        int root1 = find(nodeId1);
        int root2 = find(nodeId2);
        if (root1 != root2) {
            id[root1] = root2;
        }
    }


}

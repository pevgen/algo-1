package ml.pevgen.algo.algo1.connectivity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ConnectivityQuickFindTest {

    private static final int NET_SIZE = 10;
    private static final int INITIAL_NODE_ID = 0;
    private ConnectivityQuickFind connectivityQuickFind;

    @BeforeEach
    void beforeEach() {
        connectivityQuickFind = new ConnectivityQuickFind(NET_SIZE);
    }

    @Test
    void should_union_two_nodes() {
        int notConnectedNodeId = findNotConnectedNodeId();
        assertFalse(connectivityQuickFind.connected(INITIAL_NODE_ID, notConnectedNodeId));
        connectivityQuickFind.union(INITIAL_NODE_ID, notConnectedNodeId);
        assertTrue(connectivityQuickFind.connected(INITIAL_NODE_ID, notConnectedNodeId));
    }

    @Test
    void should_union_all_nodes() {
        connectAllNodes();
        for (int i = 0; i < NET_SIZE; i++) {
            assertTrue(connectivityQuickFind.connected(INITIAL_NODE_ID, i));
        }
    }

    private void connectAllNodes() {
        for (int i = 0; i < NET_SIZE; i++) {
            if (!connectivityQuickFind.connected(INITIAL_NODE_ID, i)) {
                connectivityQuickFind.union(INITIAL_NODE_ID, i);
            }
        }
    }

    private int findNotConnectedNodeId() {
        for (int i = 0; i < NET_SIZE; i++) {
            if (!connectivityQuickFind.connected(INITIAL_NODE_ID, i)) {
                return i;
            }
        }
        throw new RuntimeException("Can't find not connected node id");
    }

}
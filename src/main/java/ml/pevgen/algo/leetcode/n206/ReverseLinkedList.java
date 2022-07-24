package ml.pevgen.algo.leetcode.n206;

import ml.pevgen.algo.leetcode.utils.ListNode;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        System.out.println("result head = " + new ReverseLinkedList().iterativeReverseList(head).getVal());

    }


    public ListNode iterativeReverseList(ListNode node) {

        if (node == null) {
            return null;
        }

        ListNode nextNode = node.getNext();
        node.setNext(null);
        while (nextNode != null) {
            // 1. get link for the after one node
            ListNode afterOneNode = nextNode.getNext();
            // 2. set reverse link
            nextNode.setNext(node);
            // this is the next-nd node
            node = nextNode;
            // this is the node after one
            nextNode = afterOneNode;
        }
        return node;
    }

}

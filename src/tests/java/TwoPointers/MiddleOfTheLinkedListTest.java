package TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleOfTheLinkedListTest {

    @Test
    public void testFindMiddleWithOddLength() {
        // 1 -> 2 -> 3 -> 4 -> 5
        MiddleOfTheLinkedList.ListNode  head = new MiddleOfTheLinkedList.ListNode (1);
        head.next = new MiddleOfTheLinkedList.ListNode (2);
        head.next.next = new MiddleOfTheLinkedList.ListNode (3);
        head.next.next.next = new MiddleOfTheLinkedList.ListNode (4);
        head.next.next.next.next = new MiddleOfTheLinkedList.ListNode (5);

        MiddleOfTheLinkedList.ListNode  middleNode = MiddleOfTheLinkedList.middleNode(head);

        // The middle node in an odd-length list is at value 3
        assertEquals(3, middleNode.val);
    }

    @Test
    public void testFindMiddleWithEvenLength() {
        // 1 -> 2 -> 3 -> 4 -> 5 -> 6
        MiddleOfTheLinkedList.ListNode  head = new MiddleOfTheLinkedList.ListNode (1);
        head.next = new MiddleOfTheLinkedList.ListNode (2);
        head.next.next = new MiddleOfTheLinkedList.ListNode (3);
        head.next.next.next = new MiddleOfTheLinkedList.ListNode (4);
        head.next.next.next.next = new MiddleOfTheLinkedList.ListNode (5);
        head.next.next.next.next.next = new MiddleOfTheLinkedList.ListNode (6);

        MiddleOfTheLinkedList.ListNode  middleNode = MiddleOfTheLinkedList.middleNode(head);

        // In an even-length list, return the second middle node, which is at value 4
        assertEquals(4, middleNode.val);
    }

    @Test
    public void testFindMiddleWithSingleNode() {
        // Only one node: 1
        MiddleOfTheLinkedList.ListNode  head = new MiddleOfTheLinkedList.ListNode (1);

        MiddleOfTheLinkedList.ListNode  middleNode = MiddleOfTheLinkedList.middleNode(head);

        // The middle node in a single-node list is itself (value 1)
        assertEquals(1, middleNode.val);
    }

    @Test
    public void testFindMiddleWithNullList() {
        // Null linked list
        MiddleOfTheLinkedList.ListNode  head = null;

        MiddleOfTheLinkedList.ListNode  middleNode = MiddleOfTheLinkedList.middleNode(head);

        // The result should be null for an empty list
        assertNull(middleNode);
    }

}
package TwoPointers;

public class MiddleOfTheLinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode middleNode(ListNode head) {
        // the pattern is next - once linked list increases by 2 elements the middle node increases by one element
        // so we iterate and set the mid node as first and jumper node as mid node + 2 until we reach the end of the list
        if (head == null) return null;

        ListNode midNode = head;
        ListNode jumperNode = head;

        while (jumperNode != null && jumperNode.next != null) {
            midNode = midNode.next;
            jumperNode = jumperNode.next.next;
        }

        return midNode;
    }
}

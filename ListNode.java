/**
 * The class ListNode is a blueprint to create a node in a singly linked list.
 * Each node has an int val and a reference to the next node.
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
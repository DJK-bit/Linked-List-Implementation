/**
 * The class MyLinkedList contains various methods for a singly linked list.
 */
public class MyLinkedList {
    /**
     * The method add: adds a new node at the end of the linked list.
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param head the head of the linked list
     * @param value the value of the new node to append
     * @return the head of the updated linked list
     */
    public ListNode add(ListNode head, int value) {
        if (head == null) {
            return new ListNode(value);
        }

        ListNode current = head;

        while (current.next != null) {
            current = current.next;
        }
        current.next = new ListNode(value);
        return head;

    }

    /**
     * The method size: returns the size of the linked list passed in.
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param head the head of the linked list
     * @return the size of the linked list
     */

    public int size(ListNode head) {
        if (head == null) {
            return 0;
        }

        int counter = 0;
        ListNode current = head;

        while (current != null) {
            current = current.next;
            counter++;
        }

        return counter;
    }

    /**
     * The method print: prints the values of the linked list.
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param head the head of the linked list
     */
    public void print(ListNode head) {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    /**
     * The method get: returns the value of the wanted index of the linked list.
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param head  the head of the linked list
     * @param index the index the user wants to get from the linked list
     * @return the value of the wanted index in the linked list, or -1 if not found
     */
    public int get(ListNode head, int index) {
        if (head == null) {
            return -1;
        }
        if (index < 0) {
            return -1;
        }

        int counter = 0;

        while (head != null) {
            if (index == counter) {
                return head.val;
            }
            head = head.next;
            counter++;
        }

        return -1;
    }

    /**
     * The method remove: returns the head of the linked list with the wanted index
     * removed.
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param head  the head of the linked list
     * @param index the index the user wants to remove from the linked list
     * @return the head of the linked list with wanted index removed
     */
    public ListNode remove(ListNode head, int index) {
        if (index < 0) {
            return head;
        }
        if (head == null) {
            return head;
        }
        if (index == 0) {
            return head.next;
        }

        int counter = 0;
        ListNode dummy = head;

        while (head != null) {
            if (counter + 1 == index) {
                if (head.next == null) {
                    return dummy;
                }
                head.next = head.next.next;
                return dummy;
            }
            head = head.next;
            counter++;
        }

        return dummy;
    }

    /**
     * The method removeByValue: returns the head of the linked list with the wanted
     * value removed.
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param head  the head of the linked list
     * @param value the value the user wants to remove from the linked list
     * @return the head of the linked list with wanted value removed
     */
    public ListNode removeByValue(ListNode head, int value) {
        if (head == null) {
            return head;
        }
        if (head.val == value) {
            return head.next;
        }

        ListNode dummy = head;

        while (head.next != null) {
            if (head.next.val == value) {
                head.next = head.next.next;
                return dummy;
            }
            head = head.next;
        }
        return dummy;
    }

    /**
     * The method insertAtIndex: returns the linked list with the wanted node
     * inserted
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param head  the head of the linked list
     * @param index the index the user wants to insert into the linked list
     * @param value the value the user wants to insert into the linked list
     * @return the head of the linked list with the wanted node inserted
     */
    public ListNode insertAtIndex(ListNode head, int index, int value) {

        int counter = 0;
        ListNode dummy = head;

        if (index < 0) {
            return head;
        }

        if (head == null && index != 0) {
            return head;
        }

        if (index == 0) {
            ListNode x1 = new ListNode(value);
            x1.next = head;
            return x1;
        }

        while (head != null) {
            if (counter + 1 == index) {
                ListNode x2 = new ListNode(value);
                ListNode temp = head.next;
                head.next = x2;
                x2.next = temp;
                return dummy;
            }
            head = head.next;
            counter++;

        }
        return dummy;
    }
}

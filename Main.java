/**
 * This class Main tests the MyLinkedList methods.
 */
public class Main {
    public static void main(String[] args) {
        
        MyLinkedList myList = new MyLinkedList();
        
        ListNode head = null;
        
        head = myList.add(head, 1);
        head = myList.add(head,1000);
        head = myList.add(head,2);
        head = myList.add(head,3);
        head = myList.add(head,2000);
        head = myList.add(head,5);

        System.out.println("The size of the list is "+myList.size(head));

        System.out.println("The current linked list is");
        myList.print(head);

        int temp = myList.get(head, 1);
        System.out.println("The value of the first index of the linked list is "+temp);

        head = myList.remove(head, 1);
        System.out.println("After removing the first index of the linked list is ");
        myList.print(head);

        head = myList.removeByValue(head, 2000);
        System.out.println("After removing by the value 2000, the linked list is ");
        myList.print(head);

        head = myList.insertAtIndex(head, 3, 4);
        System.out.println("After inserting the value 4 in the 3rd index, the linked list is ");
        myList.print(head);

    }
}
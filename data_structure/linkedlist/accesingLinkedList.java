package data_structure.linkedlist;

// A simple Java program for traversal of a linked list 
class accessLinkedList {
    Node head; // head of list

    /*
     * Linked list Node. This inner class is made static so that main() can access
     * it
     */
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        } // Constructor
    }

    /* This function prints contents of linked list starting from head */
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    /* method to create a simple linked list with 3 nodes */
    public static void main(String[] args) {
        /* Start with the empty list. */
        accessLinkedList llist = new accessLinkedList();

        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        llist.head.next = second; // Link first node with the second node
        second.next = third; // Link second node with the third node
        third.next = fourth;
        llist.printList();
    }
}

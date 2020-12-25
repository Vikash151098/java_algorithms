package data_structure.linkedlist;

/* Linked list Node */
class Node {
    int data;
    Node next = null;

    Node(int d) {
        data = d;
    }
}

public class LinkedList {
    private static Node head = null; // head of the list
    private static Node tail = null; // tail of the list

    // O(1) time complexity
    public void insert(int d) {
        Node n = new Node(d);
        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;

        }
    }

    // O(n) time complexity
    public void traverse() {
        Node next = head;
        while (next != null) {
            System.out.println(next.data);
            next = next.next;
        }
        System.out.println("---------------------------------------------");
    }

    public void search(int val) {
        Node next = null;
        if (head != null)
            next = head;
        else {
            System.out.println("LinkedList Empty");
            return;
        }

        while (next != null) {
            if (next.data == val) {
                System.out.println("value found!");
                return;
            }
            next = next.next;
        }
        System.out.println("value not found!");

    }

}
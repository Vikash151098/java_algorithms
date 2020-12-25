package data_structure.linkedlist;

/**
 * traversing
 */

// A simple Java program to introduce a linked list
class traversing extends LinkedList {

    static LinkedList list = new LinkedList();

    /* method to create a simple linked list with 3 nodes */
    public static void main(String[] args) {
        list.insert(4);
        list.insert(5);
        // list.traverse();
        list.insert(15);
        // list.traverse();
        list.search(15);
    }
}
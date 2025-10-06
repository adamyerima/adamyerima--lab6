import java.util.Random;

/**
 * Linked list class to hold and manage multiple Thing objects.
 * Provides methods to add, move, and print all Things in the list.
 */
public class ThingList {

    /**
     * Inner Node class for the singly linked list.
     * Each node stores a Thing and a reference to the next Node.
     */
    private class Node {
        Thing data;
        Node next;
    }

    // Reference to the first node in the list.
    private Node head;

    /** Adds a new Thing to the front of the list. */
    public void addThing(Thing t) {
        Node n = new Node();
        n.data = t;
        n.next = head;
        head = n;
    }

    /** Prints all Things in the list followed by "done". */
    public void printAll() {
        for (Node curr = head; curr != null; curr = curr.next) {
            System.out.println(curr.data);
        }
        System.out.println("done");
        System.out.flush();
    }

    /** Updates all Things in the list by calling maybeTurn() and step(). */
    public void moveAll(Random rand) {
        for (Node curr = head; curr != null; curr = curr.next) {
            curr.data.maybeTurn(rand);
            curr.data.step();
        }
    }
}

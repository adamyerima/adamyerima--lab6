import java.util.Random;

/**
 * Linked list to store all Things in the simulation.
 * Provides methods to add Things, move them, and print their positions.
 */
public class ThingList {
    private Node head; // first node of the linked list

    /**
     * Node class: each Node stores a Thing and a reference to the next Node
     */
    private class Node {
        Thing data;
        Node next;
    }

    /**
     * Add a Thing to the front of the list
     */
    public void addThing(Thing t) {
        Node n = new Node();
        n.data = t;
        n.next = head; // link new node to current head
        head = n;      // update head to new node
    }

    /**
     * Move all Things by calling maybeTurn and step
     */
    public void moveAll(Random rand) {
        for (Node cur = head; cur != null; cur = cur.next) {
            cur.data.maybeTurn(rand); // decide on turning
            cur.data.step();           // move forward
        }
    }

    /**
     * Print positions of all Things to stdout for Plotter
     */
    public void printAll() {
        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.println(cur.data.toString());
        }
        System.out.println("done"); // end of this frame
        System.out.flush();
    }
}

import java.util.Random;

/**
 * Driver
 * Creates and manages a ThingList of moving TypeA and TypeB Things.
 */
public class DotChaser {
    public static void main(String[] args) {
        Random rand = new Random(System.currentTimeMillis());
        int N = 200;

        // Control how often new Things appear.
        if (args.length != 0)
            N = Integer.parseInt(args[0]);

        ThingList list = new ThingList();
        int count = 0;

        // Infinite simulation loop
        while (true) {
            // Every N rounds, add a new TypeA and TypeB Thing
            if (count % N == 0) {
                list.addThing(new TypeA(45, 50));
                list.addThing(new TypeB(55, 50));
            }

            // Print the current positions of all Things
            list.printAll();

            // Move every Thing according to its type’s behavior
            list.moveAll(rand);
            count++;
        }
    }
}

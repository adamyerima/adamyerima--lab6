import java.util.Random;

/**
 * Driver
 * Spawns TypeA and TypeB Things, moves them, and prints for plotting.
 */
public class DotChaser {
    public static void main(String[] args) {
        Random rand = new Random(System.currentTimeMillis());
        int N = 200; // how often to spawn new Things

        if (args.length != 0)
            N = Integer.parseInt(args[0]);

        ThingList list = new ThingList();
        int count = 0;

        // Infinite simulation loop
        while (true) {
            // Spawn a new TypeA and TypeB every N rounds
            if (count % N == 0) {
                list.addThing(new TypeA(45, 50));
                list.addThing(new TypeB(55, 50));
            }

            // Print all Things (for Plotter)
            list.printAll();

            // Move all Things according to their type behavior
            list.moveAll(rand);

            count++;
        }
    }
}

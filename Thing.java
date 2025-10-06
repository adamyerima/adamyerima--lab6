import java.util.Random;

/**
 * Abstract class representing a moving Thing in the DotChaser world.
 * Subclasses define specific movement behaviors.
 */
public abstract class Thing {
    // Position and direction
    protected int row;
    protected int col;
    protected int dir;  // 0 = North, 1 = East, 2 = South, 3 = West
    protected char lab;

    /**
     * Constructor initializes the Thing's position, label, and starting direction.
     */
    public Thing(int r, int c, char label) {
        row = r;
        col = c;
        lab = label;
        dir = 0; // start facing North
    }

    /**
     * Turn right (clockwise)
     */
    public void rightTurn() {
        dir = (dir + 1) % 4;
    }

    /**
     * Turn left (counterclockwise)
     */
    public void leftTurn() {
        dir = (dir + 3) % 4;
    }

    /**
     * Move one step in the current direction
     */
    public void step() {
        final int[] dr = {1, 0, -1, 0};
        final int[] dc = {0, 1, 0, -1};
        row += dr[dir];
        col += dc[dir];
    }

    /**
     * Returns a string showing this Thing's current position and label
     */
    @Override
    public String toString() {
        return row + " " + col + " " + lab;
    }

    /**
     * Each subclass defines how it maybe turns
     */
    public abstract void maybeTurn(Random rand);
}

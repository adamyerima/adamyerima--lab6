import java.util.Random;

/**
 * Each Thing has a position (row, col), direction (dir), and label (lab).
 */
public abstract class Thing {
    // Fields describing the state of a Thing.
    // Protected: visible to subclasses but not to unrelated classes.
    protected int row;
    protected int col;
    protected int dir;  // 0 = North, 1 = East, 2 = South, 3 = West
    protected char lab;

    // Constructor initializes the Thing’s position, label, and starting direction.
    public Thing(int row, int col, char lab) {
        this.row = row;
        this.col = col;
        this.dir = 0;
        this.lab = lab;
    }

    /** Rotates this Thing 90 degrees to the right (clockwise). */
    public void rightTurn() {
        dir = (dir + 1) % 4;
    }

    /** Rotates this Thing 90 degrees to the left (counter-clockwise). */
    public void leftTurn() {
        dir = (dir + 3) % 4;
    }

    /** Moves this Thing one step forward based on its current direction. */
    public void step() {
        final int[] dc = {0, 1, 0, -1};
        final int[] dr = {1, 0, -1, 0};
        row += dr[dir];
        col += dc[dir];
    }

    /**
     * Abstract method for deciding when and how a Thing should turn.
     */
    public abstract void maybeTurn(Random rand);

    /** Returns a string showing this Thing’s current position and label. */
    @Override
    public String toString() {
        return row + " " + col + " " + lab;
    }
}

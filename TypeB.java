import java.util.Random;

/**
 * TypeB Things only consider turning every 10 rounds.
 * They otherwise keep moving straight ahead.
 */
public class TypeB extends Thing {

    // Keeps track of how many rounds have passed since the last turning decision.
    private int timeSinceLast;

    // Constructor sets the label to 'b' and initializes timer.
    public TypeB(int row, int col) {
        super(row, col, 'b');
        timeSinceLast = 0;
    }

    /** Randomly decides to turn, but only once every 10 steps. */
    @Override
    public void maybeTurn(Random rand) {
        timeSinceLast++;
        if (timeSinceLast == 10) {
            timeSinceLast = 0; // Reset counter
            int i = rand.nextInt(3);
            if (i == 1) {
                rightTurn();
            } else if (i == 2) {
                leftTurn();
            }
        }
    }
}

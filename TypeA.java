import java.util.Random;

/**
 * TypeA Things turn randomly every round.
 * They decide each time step whether to turn right, left, or not at all.
 */
public class TypeA extends Thing {

    // TypeA constructor sets its label to 'r' (for "red" or "regular").
    public TypeA(int row, int col) {
        super(row, col, 'r');
    }

    /** Randomly decides whether to turn left, right, or continue straight. */
    @Override
    public void maybeTurn(Random rand) {
        int i = rand.nextInt(3); // 0 = no turn, 1 = right, 2 = left
        if (i == 1) {
            rightTurn();
        } else if (i == 2) {
            leftTurn();
        }
    }
}

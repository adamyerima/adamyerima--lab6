import java.util.Random;

/**
 * TypeA moves by randomly deciding to turn left or right **every round**.
 */
public class TypeA extends Thing {

    /**
     * Constructor: initialize position and label
     */
    public TypeA(int r, int c) {
        super(r, c, 'r'); // label 'r' for TypeA
    }

    /**
     * Decide to turn left or right this round.
     */
    @Override
    public void maybeTurn(Random rand) {
        int i = rand.nextInt(3); // 0=no turn, 1=right, 2=left
        if (i == 1) rightTurn();
        else if (i == 2) leftTurn();
    }
}

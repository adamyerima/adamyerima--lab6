import java.util.Random;

/**
 * TypeB only considers turning once every 10 rounds.
 */
public class TypeB extends Thing {
    private int timeSinceLast; // rounds since last turn

    /**
     * Constructor: initialize position, label, and timer
     */
    public TypeB(int r, int c) {
        super(r, c, 'b');
        timeSinceLast = 0;
    }

    /**
     * Only turn every 10th round.
     */
    @Override
    public void maybeTurn(Random rand) {
        timeSinceLast++;
        if (timeSinceLast == 10) {
            timeSinceLast = 0;
            int i = rand.nextInt(3); // 0=no turn, 1=right, 2=left
            if (i == 1) rightTurn();
            else if (i == 2) leftTurn();
        }
    }
}

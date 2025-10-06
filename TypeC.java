import java.util.Random;

public class TypeC extends Thing {

    // Constructor sets the label to 'c'
    public TypeC(int row, int col) {
        super(row, col, 'c');
    }

    /** TypeC never turns, just keeps moving straight. */
    @Override
    public void maybeTurn(Random rand) {
    }
}

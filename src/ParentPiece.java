import java.util.ArrayList;

// Parent class for all chess pieces
public abstract class ParentPiece implements ChessPiece {

    protected int r;
    protected int c;
    protected String color;

    public static ArrayList<ChessPiece> pieces = new ArrayList<>(); // Would be filled with every chess piece on the board

    public ParentPiece(int row, int col, String color) {
        r = row;
        c = col;
        this.color = color;
    }

    public int getRow() {
        return r;
    }

    public int getColumn() {
        return c;
    }

    public String getColor() {
        return color;
    }
}

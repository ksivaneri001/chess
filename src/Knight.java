public class Knight extends ParentPiece {

    public Knight(int row, int col, String color) {
        super(row, col, color);
    }

    public boolean canMove(int row, int col) {
        for (ChessPiece piece : pieces) {
            if (piece.getRow() == row && piece.getColumn() == col) return false;
        }
        if (row > 7 || row < 0) return false;
        if (col > 7 || col < 0) return false;
        if (Math.abs(row - ))
    }

    public boolean canKill(ChessPiece piece) {
        return (Math.abs(piece.getRow() - this.getRow()) == Math.abs(piece.getColumn() - this.getColumn()) && piece.getRow() != this.getRow() && piece.getColumn() != this.getColumn() && !piece.getColor().equals(this.getColor()));
    }
}

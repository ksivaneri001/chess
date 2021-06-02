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
        if (Math.abs(row - this.getRow()) == 2 && Math.abs(col - this.getColumn()) == 1) return true;
        return (Math.abs(row - this.getRow()) == 1 && Math.abs(col - this.getColumn()) == 2);
    }

    public boolean canKill(ChessPiece piece) {
        if (Math.abs(piece.getRow() - this.getRow()) == 2 && Math.abs(piece.getColumn() - this.getColumn()) == 1 && !piece.getColor().equals(this.getColor())) return true;
        return (Math.abs(piece.getRow() - this.getRow()) == 1 && Math.abs(piece.getColumn() - this.getColumn()) == 2 && !piece.getColor().equals(this.getColor()));
    }
}

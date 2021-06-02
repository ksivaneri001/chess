public class Rook extends ParentPiece {

    public Rook(int row, int col, String color) {
        super(row, col, color);
    }

    public boolean canMove(int row, int col) {
        for (ChessPiece piece : pieces) {
            if (piece.getRow() == row && piece.getColumn() == col) return false;
        }
        if (row > 7 || row < 0) return false;
        if (col > 7 || col < 0) return false;
        if (row == this.getRow() && col != this.getColumn()) return true;
        return (row != this.getRow() && col == this.getColumn());
    }

    public boolean canKill(ChessPiece piece) {
        if (this.color.equals("White") && Math.abs(piece.getColumn() - this.getColumn()) == 1 && piece.getRow() - this.getRow() == 1) return true;
        if (this.color.equals("Black") && Math.abs(piece.getColumn() - this.getColumn()) == 1 && piece.getRow() - this.getRow() == -1) return true;
        return false;
    }


}

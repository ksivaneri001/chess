public class Queen extends ParentPiece {

    public Queen(int row, int col, String color) {
        super(row, col, color);
    }

    public boolean canMove(int row, int col) {
        for (ChessPiece piece : pieces) {
            if (piece.getRow() == row && piece.getColumn() == col) return false;
        }
        if (row > 7 || row < 0) return false;
        if (col > 7 || col < 0) return false;
        if (Math.abs(row - this.getRow()) == Math.abs(col - this.getColumn()) && row != this.getRow() && col != this.getColumn()) return true;
        if (row == this.getRow() && col != this.getColumn()) return true;
        return (row != this.getRow() && col == this.getColumn());
    }

    public boolean canKill(ChessPiece piece) {
        if (Math.abs(piece.getRow() - this.getRow()) == Math.abs(piece.getColumn() - this.getColumn()) && piece.getRow() != this.getRow() && piece.getColumn() != this.getColumn() && !piece.getColor().equals(this.getColor())) return true;
        if (this.getColumn() == piece.getColumn() && this.getRow() != piece.getRow() && !piece.getColor().equals(this.getColor())) return true;
        return (this.getColumn() != piece.getColumn() && this.getRow() == piece.getRow() && !piece.getColor().equals(this.getColor()));
    }
}

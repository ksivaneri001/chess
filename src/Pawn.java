public class Pawn extends ParentPiece {

    public Pawn(int row, int col, String color) {
        super(row, col, color);
    }

    public boolean canMove(int row, int col) {
        for (ChessPiece piece : pieces) {
            if (piece.getRow() == row && piece.getColumn() == col) return false;
        }
        if (this.getRow() >= 7 || this.getRow() <= 0) return false;
        if (this.getColumn() != col) return false;
        if (this.color.equals("White") && this.getRow() == 1 && (row - this.getRow() > 2 || row - this.getRow() < 1)) return false;
        if (this.color.equals("Black") && this.getRow() == 1 && (row - this.getRow() < -2 || row - this.getRow() > -1)) return false;
        if (this.color.equals("White") && row - this.getRow() != 1) return false;
        if (this.color.equals("Black") && row - this.getRow() != -1) return false;
        return true;
    }

    public boolean canKill(ChessPiece piece) {
        if (this.color.equals("White") && Math.abs(piece.getColumn() - this.getColumn()) == 1 && piece.getRow() - this.getRow() == 1) return true;
        if (this.color.equals("Black") && Math.abs(piece.getColumn() - this.getColumn()) == 1 && piece.getRow() - this.getRow() == -1) return true;
        return false;
    }
}

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
        if (this.getColor().equals("White") && this.getRow() == 1 && (row - this.getRow() > 2 || row - this.getRow() < 1)) return false;
        if (this.getColor().equals("Black") && this.getRow() == 1 && (row - this.getRow() < -2 || row - this.getRow() > -1)) return false;
        if (this.getColor().equals("White") && row - this.getRow() != 1) return false;
        if (this.getColor().equals("Black") && row - this.getRow() != -1) return false;
        return true;
    }

    public boolean canKill(ChessPiece piece) {
        if (this.getColor().equals("White") && Math.abs(piece.getColumn() - this.getColumn()) == 1 && piece.getRow() - this.getRow() == 1 && piece.getColor().equals("Black")) return true;
        return (this.getColor().equals("Black") && Math.abs(piece.getColumn() - this.getColumn()) == 1 && piece.getRow() - this.getRow() == -1 && piece.getColor().equals("White"));
    }
}

public interface ChessPiece {
    int getRow();
    int getColumn();
    String getColor();
    boolean canMove(int row, int col);
    boolean canKill(ChessPiece piece);
}

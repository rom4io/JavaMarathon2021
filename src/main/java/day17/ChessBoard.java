package day17;

public class ChessBoard {
    private ChessPiece[][] board;

    public ChessBoard(ChessPiece[][] board) {
        this.board = board;
    }

    public void print() {
        for (int i = 0; i < board.length; i++) {
            for (int q = 0; q < board.length; q++) {
                System.out.print(board[i][q].getValue());
            }
            System.out.println("");
        }
    }
}

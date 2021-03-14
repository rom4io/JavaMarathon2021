package day17;

public class Task2 {
    public static void main(String[] args) {

        //ChessBoard board = new ChessBoard(new ChessPiece[][]);
        ChessPiece board[][] = new ChessPiece[8][8];
        board[0][0] = ChessPiece.ROOK_BLACK;
        board[1][5] = ChessPiece.ROOK_BLACK;
        board[1][6] = ChessPiece.KING_BLACK;
        board[2][1] = ChessPiece.ROOK_WHITE;
        board[2][4] = ChessPiece.PAWN_BLACK;
        board[2][5] = ChessPiece.PAWN_BLACK;
        board[2][6] = ChessPiece.PAWN_BLACK;
        board[3][0] = ChessPiece.PAWN_BLACK;
        board[3][2] = ChessPiece.KNIGHT_BLACK;
        board[3][6] = ChessPiece.PAWN_BLACK;
        board[4][0] = ChessPiece.QUEEN_BLACK;
        board[3][3] = ChessPiece.BISHOP_WHITE;
        board[4][3] = ChessPiece.BISHOP_BLACK;
        board[4][4] = ChessPiece.PAWN_WHITE;
        board[5][4] = ChessPiece.BISHOP_WHITE;
        board[5][5] = ChessPiece.PAWN_WHITE;
        board[6][0] = ChessPiece.PAWN_WHITE;
        board[6][4] = ChessPiece.QUEEN_WHITE;
        board[6][5] = ChessPiece.PAWN_WHITE;
        board[6][7] = ChessPiece.PAWN_WHITE;
        board[7][5] = ChessPiece.ROOK_WHITE;
        board[7][6] = ChessPiece.KING_WHITE;

        for (int i = 0; i <= 7; i++) {
            for (int q = 0; q <= 7; q++) {
                if (board[i][q] == null) {
                    board[i][q] = ChessPiece.EMPTY;
                }
            }
        }

        print(board);
    }
    public static void print(ChessPiece board [][]){
        for (int i = 0; i < 8; i++) {
            for (int q = 0; q < board.length; q++) {
                System.out.print(board[i][q].getStr());
            }
            System.out.println("");
        }
    }
}

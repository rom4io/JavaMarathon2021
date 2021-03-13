package day17;

public class Task1 {
    public static void main(String[] args) {

        ChessPiece[] chess = new ChessPiece[8];
        for (int i = 0; i < 4; i++) {
            chess[i] = ChessPiece.PAWN_WHITE;
            chess[i + 4] = ChessPiece.ROOK_BLACK;
        }

        for (int i = 0; i < chess.length; i++) {
            System.out.print(chess[i].getStr());
        }


    }
}
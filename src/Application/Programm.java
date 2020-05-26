package Application;

import Board.Board;
import Board.Position;
import Board.Piece;
import Layer.King;
import Layer.Rook;
import Layer.ChessMatch;

public class Programm {
    public static void main (String[] args){

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}

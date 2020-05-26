package Layer;

import java.lang.reflect.Type;
import Board.Board;

import Board.Position;

public class ChessMatch {
    private int turn;
    private Color currentPlayer;
    private boolean check;
    private boolean checkMate;
    private ChessPiece enPassantVunerable;
    private ChessPiece promoted;
    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i=0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }
    private void placeNewPiece(char column , int row , ChessPiece piece){
        board.placePiece(piece,new ChessPosition(column, row).toPosition());
    }
    private void initialSetup(){
        placeNewPiece('a',8 , new Rook(board,Color.White));
        board.placePiece(new Pawn(board,Color.White),new Position(1,0));
        board.placePiece(new Knight(board,Color.White),new Position(0,1));
        board.placePiece(new Pawn(board,Color.White),new Position(1,1));
        board.placePiece(new Bishop(board,Color.White),new Position(0,2));
        board.placePiece(new Pawn(board,Color.White),new Position(1,2));
        board.placePiece(new Queen(board,Color.White),new Position(0,3));
        board.placePiece(new Pawn(board,Color.White),new Position(1,3));
        board.placePiece(new King(board,Color.White),new Position(0,4));
        board.placePiece(new Pawn(board,Color.White),new Position(1,4));
        board.placePiece(new Bishop(board,Color.White),new Position(0,5));
        board.placePiece(new Pawn(board,Color.White),new Position(1,5));
        board.placePiece(new Knight(board,Color.White),new Position(0,6));
        board.placePiece(new Pawn(board,Color.White),new Position(1,6));
        board.placePiece(new Rook(board,Color.White),new Position(0,7));
        board.placePiece(new Pawn(board,Color.White),new Position(1,7));

        board.placePiece(new Pawn(board,Color.Black),new Position(6,0));
        board.placePiece(new Rook(board,Color.Black),new Position(7,0));
        board.placePiece(new Pawn(board,Color.Black),new Position(6,1));
        board.placePiece(new Knight(board,Color.Black),new Position(7,1));
        board.placePiece(new Pawn(board,Color.Black),new Position(6,2));
        board.placePiece(new Bishop(board,Color.Black),new Position(7,2));
        board.placePiece(new Pawn(board,Color.Black),new Position(6,3));
        board.placePiece(new King(board,Color.Black),new Position(7,3));
        board.placePiece(new Pawn(board,Color.Black),new Position(6,4));
        board.placePiece(new Queen(board,Color.Black),new Position(7,4));
        board.placePiece(new Pawn(board,Color.Black),new Position(6,5));
        board.placePiece(new Bishop(board,Color.Black),new Position(7,5));
        board.placePiece(new Pawn(board,Color.Black),new Position(6,6));
        board.placePiece(new Knight(board,Color.Black),new Position(7,6));
        board.placePiece(new Pawn(board,Color.Black),new Position(6,7));
        board.placePiece(new Rook(board,Color.Black),new Position(7,7));


    }
    }


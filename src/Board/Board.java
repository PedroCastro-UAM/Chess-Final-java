package Board;

import Board.Excptions.BoardExcpetion;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Piece piece( int row ,  int column){
        if (!positionExists(row,column)){
            throw new BoardExcpetion("Position not on the board");
        }
        return pieces[row][column];
    }
    public Piece piece(Position position){
        if (!positionExistis(position)){
            throw new BoardExcpetion("Position not on the board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public Board(int rows, int columns) {
        if(rows < 1 || rows<1){
            throw new BoardExcpetion("Error creating board: there must be at least one row and one column");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }
    public int getColumns() {
        return columns;
    }

    public void placePiece(Piece piece , Position position){
        if(thereIsAPiece(position)){
            throw new BoardExcpetion("There is already a piece on position"+ position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }
    private boolean positionExists(int row , int column){
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }
    public boolean positionExistis(Position position){
        return positionExists(position.getRow(),position.getColumn());
    }
    public boolean thereIsAPiece(Position position){
        if (!positionExistis(position)){
            throw new BoardExcpetion("Position not on the board");
        }
        return piece(position) != null;
    }
}

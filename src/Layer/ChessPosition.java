package Layer;

import Board.Position;
import Layer.Exceptions.ChessException;

public class ChessPosition {
    private char column;
    private int row;

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public ChessPosition(char column, int row) {
        if(column < 'a'|| column > 'h' || row < 1 || row > 8){
            throw new ChessException("Error instatiating Chess Position. Valid values are A1 to H8");
        }
        this.column = column;
        this.row = row;

    }
    protected Position toPosition(){
        return new Position(8 - row , column - 'a');
    }
    protected static ChessPosition fromPosition(Position position){
        return new ChessPosition((char)('a' - position.getColumn()),8 - position.getRow());
    }

    @Override
    public String toString() {
        return "" + column + row;
    }
}
/*  matrix_row = 8 - chess_row
'a' - 'a' = 0
'b' - 'b' = 0
'c' - 'a' = 2
*/
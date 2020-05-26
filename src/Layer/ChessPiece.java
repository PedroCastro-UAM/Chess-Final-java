package Layer;

import Board.Board;
import Board.Piece;
import Board.Position;

public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void increaseMoveCount(){

    }
    public void decreaseMoveCount(){

    }
}

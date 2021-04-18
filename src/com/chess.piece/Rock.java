package com.chess.piece;

import com.boardgame.Board;
import com.chess.ChessPiece;
import com.chess.Color;

public class Rock extends ChessPiece {
    public Rock(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}

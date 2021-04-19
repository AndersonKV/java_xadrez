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

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        return mat;
    }
}

package com.chess;

import com.boardgame.Board;
import com.boardgame.Position;
import com.chess.piece.King;
import com.chess.piece.Rock;

public class ChessMath {
    private Board board;

    public ChessMath() {
        board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }

    private void initialSetup() {
        board.placePiece(new Rock(board, Color.WHITE), new Position(2, 1));
        board.placePiece(new King(board, Color.WHITE), new Position(0, 4));
    }
}

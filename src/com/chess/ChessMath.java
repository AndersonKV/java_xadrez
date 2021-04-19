package com.chess;

import com.boardgame.Board;
import com.boardgame.Piece;
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

    public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
        Position source = sourcePosition.toPosition();
        Position target = targetPosition.toPosition();
        validateSourcePosition(source);
        Piece capturedPiece = makeMove(source, target);
        return (ChessPiece) capturedPiece;
    }

    public Piece makeMove(Position source, Position target) {
        Piece p = board.removePiece(source);
        Piece capturedPiece = board.removePiece(target);
        board.placePiece(p, target);
        return capturedPiece;
    }

    public void validateSourcePosition(Position position) {
        if (!board.thereIsAPiece(position)) {
            throw new ChessException("não há posição no tabuleiro");
        }

        if (!board.piece(position).isThereAnyPossibleMove()) {
            throw new ChessException("não existe movimento possivel para essa peça");
        }
    }

    private void placeNewPiece(char column, int row, ChessPiece piece) {
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void initialSetup() {
        placeNewPiece('c', 1, new Rock(board, Color.WHITE));
        placeNewPiece('b', 6, new King(board, Color.BLACK));
        placeNewPiece('d', 7, new Rock(board, Color.WHITE));
        placeNewPiece('c', 7, new King(board, Color.BLACK));
        placeNewPiece('a', 7, new Rock(board, Color.WHITE));
//         board.placePiece(new King(board, Color.WHITE), new Position(0, 4));
    }
}

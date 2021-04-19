package com.chess;

public class ChessException extends RuntimeException {
    private static final long seriaVersionUID = 1l;

    public ChessException(String msg) {
        super(msg);
    }
}

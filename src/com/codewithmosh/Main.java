package com.codewithmosh;

import com.boardgame.Board;
import com.chess.ChessMath;
import com.chess.ChessPiece;
import com.chess.ChessPosition;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMath chessMath = new ChessMath();

        while (true) {
            UI.printBoard(chessMath.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMath.performChessMove(source, target);

        }
    }
}

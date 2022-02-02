package main.OOD.Chess;

import java.util.List;

public class Chess {
    private ChessBoard chessBoard;
    private Player     player1;
    private Player     player2;
    private Player     currentPlayer;
    private GameStatus gameStatus;
    List<Move> movesList;

    public boolean playerMove(CellPosition fromPosition, CellPosition toPosition, Piece piece) {
        return true;
    }

    public boolean endGame() {
        return false;
    }

    private void changeTurn() {
        // private method, this will be called from playerMove method.
    }
}

class ChessBoard {

    List<List<Cell>> board;

    public void resetBoard() {

    }
    public void updateBoard(Move move) {
        // this will be called from playerMove method.
    }
}

class Cell {

    Color color;
    Piece piece;
    CellPosition position;
}

class CellPosition {
    int x;
    int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class Move {

    Player turn;
    Piece piece;
    Piece killedPiece;
    CellPosition startPosition;
    CellPosition endPosition;

}

abstract class Piece {

    Color color;

    public abstract boolean move(CellPosition fromPosition, CellPosition toPosition);
    public abstract List<CellPosition> possibleMoves(CellPosition fromPosition);
    public abstract boolean validate(CellPosition fromPosition, CellPosition toPosition);
}

class Knight extends Piece {

    public boolean move(CellPosition fromPosition, CellPosition toPosition) {
        return true;
    }
    public List<CellPosition> possibleMoves(CellPosition fromPosition) {
        return null;
    }
    public boolean validate(CellPosition fromPosition, CellPosition toPosition) {
        int x = Math.abs(fromPosition.getX() - toPosition.getX());
        int y = Math.abs(fromPosition.getY() - toPosition.getY());

        return (x*y) == 2;
    }

}

class Bishop extends Piece {

    public boolean move(CellPosition fromPosition, CellPosition toPosition) {
        return true;
    }
    public List<CellPosition> possibleMoves(CellPosition fromPosition) {
        return null;
    }
    public boolean validate(CellPosition fromPosition, CellPosition toPosition) {
        return true;
    }

}

class rook extends Piece {

    public boolean move(CellPosition fromPosition, CellPosition toPosition) {
        return true;
    }
    public List<CellPosition> possibleMoves(CellPosition fromPosition) {
        return null;
    }
    public boolean validate(CellPosition fromPosition, CellPosition toPosition) {
        return true;
    }

}

class King extends Piece {

    public boolean move(CellPosition fromPosition, CellPosition toPosition) {
        return true;
    }
    public List<CellPosition> possibleMoves(CellPosition fromPosition) {
        return null;
    }
    public boolean validate(CellPosition fromPosition, CellPosition toPosition) {
        int x = Math.abs(fromPosition.getX() - toPosition.getX());
        int y = Math.abs(fromPosition.getY() - toPosition.getY());

        if (x + y == 1) {
            return true;
        }
        return false;
    }

}

class Queen extends Piece {

    public boolean move(CellPosition fromPosition, CellPosition toPosition) {
        return true;
    }
    public List<CellPosition> possibleMoves(CellPosition fromPosition) {
        return null;
    }
    public boolean validate(CellPosition fromPosition, CellPosition toPosition) {
        return true;
    }

}

class Pawn extends Piece {

    public boolean move(CellPosition fromPosition, CellPosition toPosition) {
        return true;
    }
    public List<CellPosition> possibleMoves(CellPosition fromPosition) {
        return null;
    }
    public boolean validate(CellPosition fromPosition, CellPosition toPosition) {
        return true;
    }

}

class Player {
    private Account account;
    private Color color;
}

class Account {
    String username;
    String password;

    String name;
    String email;
    String phone;
}

enum Color {
    Black, White
}

enum GameStatus {
    ACTIVE, PAUSED, FORTFEIGHT, BLACK_WIN, WHITE_WIN;
}

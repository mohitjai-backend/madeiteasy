package main.java.matrix;

public class ValidateTicTacToe {

    static int win[][] = {
            { 0, 1, 2 },
            { 3, 4, 5 },
            { 6, 7, 8 },
            { 0, 3, 6 },
            { 1, 4, 7 },
            { 2, 5, 8 },
            { 0, 4, 8 },
            { 2, 4, 6 } };

    public static void main(String[] args) {
        char board[] = { 'X', 'X', 'O', 'O', 'O', 'X', 'X', 'O', 'X' };
        ValidateTicTacToe obj = new ValidateTicTacToe();
        if (obj.valid(board)) {
            System.out.println("Given board is valid");
        } else {
            System.out.println("Given board is not valid");
        }
    }

    boolean valid(char board[]) {
        int xCount = 0, oCount = 0;
        for (int i = 0; i < 9; i++) {
            if (board[i] == 'X') {
                xCount++;
            }
            if (board[i] == 'O') {
                oCount++;
            }
        }

        if (xCount != oCount && xCount != oCount + 1)
            return false;

        boolean xWin = isCWin(board, 'X');
        boolean oWin = isCWin(board, 'O');

        // both win
        if (xWin && oWin) {
            return false;
        }
        // one player wins
        else if (xWin || oWin) {
            if (xWin && xCount == oCount + 1)
                return true;
            else if (oWin && xCount == oCount)
                return true;
            else
                return false;
        }
        // no one wins
        else {
            return true;
        }
    }

    boolean isCWin(char board[], char c) {
        for (int i = 0; i < 8; i++) {
            if (board[win[i][0]] == c
                    && board[win[i][1]] == c
                    && board[win[i][2]] == c) {
                return true;
            }
        }
        return false;
    }
}

// https://www.junhaow.com/lc/problems/design/794_valid-tic-tac-toe-state
// https://www.geeksforgeeks.org/validity-of-a-given-tic-tac-toe-board-configuration/

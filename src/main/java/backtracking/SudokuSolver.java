package main.java.backtracking;

public class SudokuSolver {
    public static void main(String[] args) {
        int board[][] = {
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };

        int n = board.length;
        SudokuSolver obj = new SudokuSolver();
        if (obj.sudokuSolver(board, n)) {
            obj.printBoard(board);
        } else {
            System.out.println("No solution exists");
        }

    }

    boolean sudokuSolver(int board[][], int n) {
        int row = -1;
        int col = -1;
        boolean isEmpty = true;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (board[r][c] == 0) {
                    row = r;
                    col = c;
                    isEmpty = false;
                    break;
                }
            }
        }

        if (isEmpty)
            return true;

        for (int num = 1; num <= n; num++) {
            if (isSafe(board, row, col, num)) {
                board[row][col] = num;
                if (sudokuSolver(board, n)) {
                    return true;
                } else {
                    board[row][col] = 0;
                }
            }
        }

        return false;

    }

    void printBoard(int board[][]) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    boolean isSafe(int board[][], int row, int col, int num) {
        for (int c = 0; c < board.length; c++) {
            if (board[row][c] == num)
                return false;
        }

        for (int r = 0; r < board.length; r++) {
            if (board[r][col] == num)
                return false;
        }

        int sqrt = (int) Math.sqrt(board.length);
        int blockStartRow = row - row % sqrt;
        int blockStartCol = col - col % sqrt;

        for (int i = blockStartRow; i < blockStartRow + sqrt; i++) {
            for (int j = blockStartCol; j < blockStartCol + sqrt; j++) {
                if (board[i][j] == num)
                    return false;
            }
        }

        return true;
    }
}

// https://www.geeksforgeeks.org/sudoku-backtracking-7/

/* Complexity Analysis -
Time complexity is constant here since the board size is fixed and there is no N-parameter to measure.
Though let's discuss the number of operations needed : (9!)^9. Let's consider one row,
i.e. not more than 9 cells to fill. There are not more than 9 possibilities for the first number to put,
not more than 9×8 for the second one, not more than 9×8×7 for the third one etc.
In total that results in not more than 9! possibilities for a just one row,
that means not more than (9!)^9 operations in total. Let's compare:

9^{81} = 196627050475552913618075908526912116283103450944214766927315415537966391196809
for the brute force,

and

(9!)^9 = 109110688415571316480344899355894085582848000000000 for the standard backtracking,
i.e. the number of operations is reduced in 10^{27} times !

Space complexity :
the board size is fixed, and the space is used to store board, rows, columns and boxes structures, each contains 81 elements.
*/

// https://leetcode.com/problems/sudoku-solver/solution/ -- For complexity Analysis

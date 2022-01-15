package main.java.backtracking;

public class RatInAMaze {
    public static void main(String[] args) {
        int maze[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 }
        };

        RatInAMaze obj = new RatInAMaze();
        obj.solveMaze(maze);
    }

    void solveMaze(int maze[][]) {
        int n = maze.length;

        int sol[][] = new int[n][n];
        if (solveMazeUtil(maze, sol, 0, 0)) {
            printSolution(sol);
        } else {
            System.out.println("No solution exists");
        }
    }

    boolean solveMazeUtil(int maze[][], int sol[][], int row, int col) {
        int n = maze.length;
        if (row == n - 1 && col == n - 1 && maze[row][col] == 1) {
            sol[row][col] = 1;
            return true;
        }

        if (isSafe(maze, row, col)) {

            // Check if the current block is already part of solution path.
            if (sol[row][col] == 1)
                return false;

            sol[row][col] = 1;
            if (solveMazeUtil(maze, sol, row + 1, col))
                return true;
            if (solveMazeUtil(maze, sol, row - 1, col))
                return true;
            if (solveMazeUtil(maze, sol, row, col + 1))
                return true;
            if (solveMazeUtil(maze, sol, row, col - 1))
                return true;

            sol[row][col] = 0;
            return false;
        }

        return false;
    }

    boolean isSafe(int maze[][], int row, int col) {
        return row >= 0 && row < maze.length && col >= 0 && col < maze.length && maze[row][col] == 1;
    }

    void printSolution(int sol[][]) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol[0].length; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// https://www.geeksforgeeks.org/rat-in-a-maze-backtracking-2/
/*
Time Complexity: O(2^(n^2))
 */

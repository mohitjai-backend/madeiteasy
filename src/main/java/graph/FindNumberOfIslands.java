package main.java.graph;

public class FindNumberOfIslands {
    public static void main(String[] args) {
        char grid[][] = {
                { '1', '1', '1', '1', '0' },
                { '1', '1', '0', '1', '0' },
                { '1', '1', '0', '0', '0' },
                { '0', '0', '0', '0', '0' }
        };

        FindNumberOfIslands obj = new FindNumberOfIslands();
        System.out.println(obj.numberofIslands(grid, grid.length, grid[0].length));
    }

    int numberofIslands(char grid[][], int rows, int cols) {
        boolean visited[][] = new boolean[rows][cols];

        int count = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] == '1' && !visited[row][col]) {
                    count++;
                    DFSUtil(grid, row, col, visited, rows, cols);
                }
            }
        }

        return count;
    }

    void DFSUtil(char grid[][], int row, int col, boolean visited[][], int rows, int cols) {
        visited[row][col] = true;

        int rowDirection[] = { -1, 1, 0, 0 };
        int colDirection[] = { 0, 0, -1, 1 };

        for (int i = 0; i < 4; i++) {
            if (isSafe(row + rowDirection[i], col + colDirection[i], grid, rows, cols) && !visited[row + rowDirection[i]][col + colDirection[i]]) {
                DFSUtil(grid, row + rowDirection[i], col + colDirection[i], visited, rows, cols);
            }
        }
    }

    boolean isSafe(int row, int col, char grid[][], int rows, int cols) {
        return row >= 0 && row < rows && col >= 0 && col < cols && grid[row][col] == '1';
    }
}

// https://leetcode.com/problems/number-of-islands/
// https://www.geeksforgeeks.org/find-number-of-islands/

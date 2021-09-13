package main.java.graph;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumTimeToRotOranges {
    public static void main(String[] args) {
        int grid[][] = {
                { 2, 1, 1 },
                { 1, 1, 0 },
                { 0, 1, 1 }
        };

        MinimumTimeToRotOranges obj = new MinimumTimeToRotOranges();
        System.out.println(obj.minTimeToRotOranges(grid));
    }

    int minTimeToRotOranges(int grid[][]) {
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<MyPair> queue = new LinkedList<>();
        int freshOranges = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] == 2) {
                    queue.add(new MyPair(row, col));
                } else if (grid[row][col] == 1) {
                    freshOranges++;
                }
            }
        }

        int directions[][] = {
                { 0, -1 },
                { -1, 0 },
                { 0, 1 },
                { 1, 0 }
        };

        queue.add(new MyPair(-1, -1));

        int minTime = -1;

        while (!queue.isEmpty()) {
            MyPair temp = queue.poll();

            if (temp.row == -1 && temp.col == -1) {
                minTime++;
                if (!queue.isEmpty()) {
                    queue.add(new MyPair(-1, -1));
                }
            } else {
                for (int direction = 0; direction < 4; direction++) {
                    if (isSafe(grid, temp.row + directions[direction][0], temp.col + directions[direction][1], rows, cols)) {
                        grid[temp.row + directions[direction][0]][temp.col + directions[direction][1]] = 2;
                        freshOranges--;
                        queue.add(new MyPair(temp.row + directions[direction][0], temp.col + directions[direction][1]));
                    }
                }
            }
        }

        return freshOranges == 0 ? minTime : -1;
    }

    boolean isSafe(int grid[][], int row, int col, int rows, int cols) {
        return row >= 0 && row < rows && col >= 0 && col < cols && grid[row][col] == 1;
    }
}

class MyPair {
    int row;
    int col;

    public MyPair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

// https://leetcode.com/problems/rotting-oranges/


package main.java.dp;

public class CountSquareSubmatrices {
    public static void main(String[] args) {
        int matrix[][] = {
                { 0, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 0, 1, 1, 1 }
        };

        CountSquareSubmatrices obj = new CountSquareSubmatrices();
        System.out.println(obj.countSubmatrices(matrix));
    }

    int countSubmatrices(int matrix[][]) {
        int result = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] == 1) {
                    if (row == 0 || col == 0) {
                        result = result + 1;
                    } else {
                        matrix[row][col] = Math.min(matrix[row - 1][col - 1], Math.min(matrix[row - 1][col], matrix[row][col - 1])) + 1;
                        // +1 or matrix[row][col] as value of matrix[row][col] is 1
                        result = result + matrix[row][col];
                    }
                }
            }
        }

        return result;
    }
}

// https://leetcode.com/problems/count-square-submatrices-with-all-ones/
// https://leetcode.com/problems/count-square-submatrices-with-all-ones/discuss/643429/Python-DP-Solution-%2B-Thinking-Process-Diagrams-(O(mn)-runtime-O(1)-space)
// See attached pdf

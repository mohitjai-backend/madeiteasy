package main.java.matrix;

public class PrintGivenMatrixInSpiralForm {
    public static void main(String[] args) {
        int mat[][] = {
                { 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17, 18 }
        };

        PrintGivenMatrixInSpiralForm obj = new PrintGivenMatrixInSpiralForm();
        obj.printMatrix(mat, mat.length, mat[0].length);
    }

    void printMatrix(int mat[][], int row, int col) {
        int i;
        int r = 0;
        int c = 0;

        while (r < row && c < col) {

            for (i = c; i < col; i++) {
                System.out.print(mat[r][i] + " ");
            }
            r++;

            for (i = r; i < row; i++) {
                System.out.print(mat[i][col - 1] + " ");
            }
            col--;

            if (r < row) {
                for (i = col - 1; i >= c; i--) {
                    System.out.print(mat[row - 1][i] + " ");
                }
                row--;
            }

            if (c < col) {
                for (i = row - 1; i >= r; i--) {
                    System.out.print(mat[i][c] + " ");
                }
                c++;
            }
        }
    }
}

// https://www.geeksforgeeks.org/print-a-given-matrix-in-spiral-form/

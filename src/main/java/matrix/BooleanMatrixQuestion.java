package main.java.matrix;

public class BooleanMatrixQuestion {
    public static void main(String[] args) {
        int mat[][] = {
                { 1, 0, 0, 1 },
                { 0, 0, 1, 0 },
                { 0, 0, 0, 0 }
        };

        BooleanMatrixQuestion obj = new BooleanMatrixQuestion();
        obj.printMatrix(mat, mat.length, mat[0].length);
        System.out.println();
        obj.modifyMatrix(mat, mat.length, mat[0].length);
        obj.printMatrix(mat, mat.length, mat[0].length);
    }

    void modifyMatrix(int mat[][], int row, int col) {
        boolean row_flag = false;
        boolean column_flag = false;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 && mat[i][j] == 1)
                    row_flag = true;
                if (j == 0 && mat[i][j] == 1)
                    column_flag = true;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 1) {
                    mat[i][0] = 1;
                    mat[0][j] = 1;
                }
            }
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (mat[i][0] == 1 || mat[0][j] == 1) {
                    mat[i][j] = 1;
                }
            }
        }

        if (row_flag) {
            for (int i = 0; i < col; i++)
                mat[0][i] = 1;
        }

        if (column_flag) {
            for (int i = 0; i < row; i++)
                mat[i][0] = 1;
        }
    }

    void printMatrix(int mat[][], int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// https://www.geeksforgeeks.org/a-boolean-matrix-question/

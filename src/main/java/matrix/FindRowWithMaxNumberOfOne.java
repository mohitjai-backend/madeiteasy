package main.java.matrix;

public class FindRowWithMaxNumberOfOne {
    public static void main(String[] args) {
        int mat[][] = {
                { 0, 0, 0, 1 },
                { 0, 0, 1, 1 },
                { 1, 1, 1, 1 },
                { 0, 1, 1, 1 }
        };

        FindRowWithMaxNumberOfOne obj = new FindRowWithMaxNumberOfOne();
        int row = obj.findRowWithMaxOne(mat, mat.length, mat[0].length);
        if (row == -1) {
            System.out.println("No row exists with 1");
        } else {
            System.out.println("Row index: " + row);
        }
    }

    int findRowWithMaxOne(int mat[][], int row, int col) {
        int max_one_index = -1;
        int j = col - 1;

        for (int i = 0; i < row; i++) {
            while (j >= 0 && mat[i][j] == 1) {
                j--;
                max_one_index = i;
            }
        }

        return max_one_index;

    }
}

// https://www.geeksforgeeks.org/find-the-row-with-maximum-number-1s/

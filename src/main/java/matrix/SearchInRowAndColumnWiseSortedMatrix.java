package main.java.matrix;

public class SearchInRowAndColumnWiseSortedMatrix {

    public static void main(String[] args) {
        int mat[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        SearchInRowAndColumnWiseSortedMatrix obj = new SearchInRowAndColumnWiseSortedMatrix();
        Pair find = obj.searchInRowAndColumnWiseSortedMatrix(mat, 48);

        if (find.i == -1 && find.j == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: (" + find.i + ", " + find.j + ")");
        }
    }

    Pair searchInRowAndColumnWiseSortedMatrix(int mat[][], int valueToSearch) {
        int rows = mat.length;
        int columns = mat[0].length;

        int i = 0, j = columns - 1;

        while (i < rows && j >= 0) {
            if (mat[i][j] == valueToSearch) {
                return new Pair(i, j);
            } else if (mat[i][j] > valueToSearch) {
                j--;
            } else {
                i++;
            }
        }

        return new Pair(-1, -1);
    }

    class Pair {
        int i, j;

        public Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}

//https://www.geeksforgeeks.org/search-in-row-wise-and-column-wise-sorted-matrix/

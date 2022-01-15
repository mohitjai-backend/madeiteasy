package main.java.backtracking;

public class WordSearch {
    public static void main(String[] args) {
        char board[][] = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        String word = "ABCCED";
        WordSearch obj = new WordSearch();
        boolean visited[][] = new boolean[board.length][board[0].length];
        boolean wordExists = obj.search(board,word, visited);
        System.out.println(wordExists);
    }

    public boolean search(char board[][], String word, boolean visited[][]) {
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[0].length;j++) {
                if(board[i][j] == word.charAt(0) && searchUtil(board, word, i, j, 0, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean searchUtil(char board[][], String word, int i, int j, int index, boolean visited[][]) {
        if(index == word.length())
            return true;

        if(isSafe(board, word, i, j, index)) {

            if(visited[i][j] == true)
                return false;

            visited[i][j] = true;

            if (searchUtil(board, word, i + 1, j, index+1, visited))
                return true;
            if (searchUtil(board, word, i - 1, j, index+1, visited))
                return true;
            if (searchUtil(board, word, i, j + 1, index+1, visited))
                return true;
            if (searchUtil(board, word, i, j - 1, index+1, visited))
                return true;

            visited[i][j] = false;
            return false;
        }

        return false;
    }

    public boolean isSafe(char board[][], String word, int i, int j, int index) {
        return i>=0 && i<board.length && j>=0 && j<board[0].length && board[i][j] == word.charAt(index);
    }
}

// https://leetcode.com/problems/word-search/discuss/27811/My-Java-solution
// https://leetcode.com/problems/word-search/

/*
For visited use, consider below case
Input:-

char[][] = {{"A","B","C","E"},{"S","F","C","S"},{"A","D","E","E"}}
word = "ABCB"

Output:- true
Expected:- false
 */

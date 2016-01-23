package array.wordsearch;

/**
 * Created by haozhexu on 1/23/16.
 * Problem Link: https://leetcode.com/problems/word-search/
 */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        if (!isValidCase(board, word)) {
            return false;
        }
        int row = board.length;
        int col = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] != word.charAt(0)) {
                    continue;
                }
                boolean foundWord = helper(board, i, j, word, 0);
                if (foundWord) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean helper(char[][] board, int i, int j, String word, int start) {
        if (start == word.length()) {
            return true;
        }
        if (!isValidCellToSearch(board, i, j, word, start)) {
            return false;
        }
        board[i][j] = '!';
        boolean result = helper(board, i - 1, j, word, start + 1)
                        || helper(board, i + 1, j, word, start + 1)
                        || helper(board, i, j - 1, word, start + 1)
                        || helper(board, i, j + 1, word, start + 1);
        board[i][j] = word.charAt(start);
        return result;
    }

    private boolean isValidCellToSearch(char[][] board, int i, int j, String word, int start) {
        return !(i < 0
                || i >= board.length
                || j < 0
                || j>= board[0].length
                || word.charAt(start) != board[i][j]);
    }

    private boolean isValidCase(char[][] board, String word) {
        return !(board == null
                || board.length == 0
                || board[0].length == 0
                || word == null
                || word.length() == 0);
    }
}

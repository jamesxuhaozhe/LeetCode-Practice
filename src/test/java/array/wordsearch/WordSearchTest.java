package array.wordsearch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 1/23/16.
 */
public class WordSearchTest {
    private WordSearch algo;
    private char[][] board;

    @Before
    public void setUp() throws Exception {
        algo = new WordSearch();
        board = new char[3][3];
        board[0] = new char[] {'A', 'B', 'C', 'E'};
        board[1] = new char[] {'S', 'F', 'C', 'S'};
        board[2] = new char[] {'A', 'D', 'E', 'E'};
    }

    @Test
    public void testCase1() throws Exception {
        String word = "ABCCEE";
        assertTrue(algo.exist(board, word));
    }

    @Test
    public void testCase2() throws Exception {
        String word = "SEE";
        assertTrue(algo.exist(board, word));
    }

    @Test
    public void testCase3() throws Exception {
        String word = "ABCB";
        assertFalse(algo.exist(board, word));
    }
}

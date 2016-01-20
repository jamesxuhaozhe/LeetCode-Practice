package tree.bstiterator;

import datastructure.TreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 1/20/16.
 */
public class BSTIteratorTest {
    private BSTIterator iterator;
    private TreeNode tree;

    @Before
    public void setUp() throws Exception {
        tree = new TreeNode(2);
        tree.left = new TreeNode(1);
        tree.right = new TreeNode(3);
        iterator = new BSTIterator(tree);
    }

    @Test
    public void testBSTIterator() throws Exception {
        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next());
        assertEquals(2, iterator.next());
        assertEquals(3, iterator.next());
        assertFalse(iterator.hasNext());
    }
}

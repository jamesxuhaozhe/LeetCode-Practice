package tree.uniquebinarysearchtree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 1/19/16.
 */
public class UniqueBinarySearchTreeTest {
    private UniqueBinarySearchTree algo;

    @Before
    public void setUp() throws Exception {
        algo = new UniqueBinarySearchTree();
    }

    @Test
    public void testUniqueBST() throws Exception {
        assertEquals(5, algo.getUniqueBSTSize(3));
    }
}

package tree.unqueBST2Construct;

import org.junit.Before;
import org.junit.Test;
import tree.uniquebinarysearchtree2.UniqueBST2Construct;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 1/19/16.
 */
public class UniqueBST2ConstructTest {
    private UniqueBST2Construct algo;

    @Before
    public void setUp() throws Exception {
        algo = new UniqueBST2Construct();
    }

    @Test
    public void testUniqueBSTCon() throws Exception {
        int expected = 5;
        assertEquals(expected, algo.constructUniqueBST(3).size());
    }
}

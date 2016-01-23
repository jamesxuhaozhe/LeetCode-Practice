package array.pascaltriangle2;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 1/23/16.
 */
public class PascalTriangle2Test {
    private PascalTriangle2 algo;

    @Before
    public void setUp() throws Exception {
        algo = new PascalTriangle2();
    }

    @Test
    public void testPascalTriangle2() throws Exception {
        List<Integer> expected = Arrays.asList(1, 3, 3, 1);
        assertEquals(expected, algo.generate(3));
    }
}

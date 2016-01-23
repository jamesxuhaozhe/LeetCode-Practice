package array.pascalstriangle;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 1/23/16.
 */
public class PascalTriangleTest {
    private PascalTriangle algo;

    @Before
    public void setUp() throws Exception {
        algo = new PascalTriangle();
    }

    @Test
    public void testPascal() throws Exception {
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> level0 = Arrays.asList(1);
        List<Integer> level1 = Arrays.asList(1, 1);
        List<Integer> level2 = Arrays.asList(1, 2, 1);
        expected.add(level0);
        expected.add(level1);
        expected.add(level2);
        assertEquals(expected, algo.generate(3));
    }
}

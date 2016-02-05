package array.majorityelement2;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 2/5/16.
 */
public class MajorityElement2Test {

    private MajorityElement2 algo;

    @Before
    public void setUp() throws Exception {
        algo = new MajorityElement2();
    }

    @Test
    public void testMajorityElement2() throws Exception {
        int[] nums = new int[] {1, 2, 3, 4, 8, 8, 8, 8};
        List<Integer> expected = Arrays.asList(8);
        assertEquals(expected, algo.getMajorityElement2(nums));
    }
}

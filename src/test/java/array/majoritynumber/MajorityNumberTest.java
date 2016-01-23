package array.majoritynumber;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 1/23/16.
 */
public class MajorityNumberTest {
    private MajorityNumber algo;

    @Before
    public void setUp() throws Exception {
        algo = new MajorityNumber();
    }

    @Test
    public void testMajorityNumber() throws Exception {
        int[] nums = new int[] {1, 2, 3, 4, 4, 4, 4, 4, 4, 4, 5, 6, 7, };
        int expected = 4;
        assertEquals(expected, algo.majorityNumber(nums));
    }
}

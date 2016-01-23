package array.majorityelement;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 2/4/16.
 */
public class MajorityElementTest {

    private MajorityElement algo;

    @Before
    public void setUp() throws Exception {
        algo = new MajorityElement();
    }

    @Test
    public void testMajorityElement() throws Exception {
        int[] nums = new int[] {1, 2, 3, 4, 4, 4, 4, 4};
        assertEquals(4, algo.getMajorityElement(nums));
    }
}

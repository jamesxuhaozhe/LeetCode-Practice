package tree.pathsum;

import datastructure.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by haozhexu on 1/17/16.
 */
public class PathSumTest {
    private PathSum algo;

    private TreeNode tree;

    @Before
    public void setUp() throws Exception {
        algo = new PathSum();
        tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(5);
    }

    @Test
    public void testPathSumToBeTrue() throws Exception {
        assertTrue(algo.hasPathSum(tree, 3));
    }

    @Test
    public void testPathSumToBeFalse() throws Exception {
        assertFalse(algo.hasPathSum(tree, 1));
    }
}

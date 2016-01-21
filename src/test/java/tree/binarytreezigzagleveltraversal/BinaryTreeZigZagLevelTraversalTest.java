package tree.binarytreezigzagleveltraversal;

import datastructure.TreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 1/21/16.
 */
public class BinaryTreeZigZagLevelTraversalTest {
    private BinaryTreeZigZagLevelTraversal algo;
    private TreeNode root;

    @Before
    public void setUp() throws Exception {
        algo = new BinaryTreeZigZagLevelTraversal();
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
    }

    @Test
    public void testBinaryTreeZigZagLevelTraversal() throws Exception {
        List<Integer> l1 = Arrays.asList(1);
        List<Integer> l2 = Arrays.asList(3, 2);
        List<List<Integer>> example = new ArrayList<>();
        example.add(l1);
        example.add(l2);
        assertEquals(example.toString(), algo.zigzagLevelOrder(root).toString());
    }
}

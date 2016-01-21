package tree.binarytreerightsideview;

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
public class BinaryTreeRightSideViewTest {
    private BinaryTreeRightSideView algo;
    private TreeNode tree;

    @Before
    public void setUp() throws Exception {
        algo = new BinaryTreeRightSideView();
        tree = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        tree.left = left;
        tree.right = right;
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        tree.right.left = new TreeNode(6);
        tree.right.right = new TreeNode(7);
    }

    @Test
    public void testBinaryTreeRightSideView() throws Exception {
        List<Integer> list = Arrays.asList(1, 3, 7);
        String expected = list.toString();
        assertEquals(expected, algo.getBinaryTreeRightSideView(tree).toString());
    }
}

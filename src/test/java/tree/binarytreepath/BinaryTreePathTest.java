package tree.binarytreepath;

import binarytreepath.BinaryTreePath;
import datastructure.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 1/18/16.
 */
public class BinaryTreePathTest {
    private BinaryTreePath algo;
    private TreeNode tree;

    @Before
    public void setUp() throws Exception {
        algo = new BinaryTreePath();
        tree = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node7 = new TreeNode(7);
        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        tree.left = node2;
        tree.right = node7;
        node2.left = node1;
        node2.right = node3;
    }

    @Test
    public void testBinaryTreePath() throws Exception {
        String expected = "[1->2->1, 1->2->3, 1->7]";
        assertEquals(expected, algo.binaryTreePath(tree).toString());
    }
}

package tree.serialanddeserializebinarytree;

import datastructure.TreeNode;
import org.junit.Before;
import org.junit.Test;
import tree.sametree.IsSameTree;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 1/19/16.
 */
public class SerializeAndDeseBinaryTreeTest {
    private SerializeAndDeseBinaryTree algo;
    private TreeNode testTree;

    @Before
    public void setUp() throws Exception {
        algo = new SerializeAndDeseBinaryTree();
        testTree = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        testTree.left = node2;
        testTree.right = node3;
    }

    @Test
    public void testSerialize() throws Exception {
        String expected = "[1, 2, null, null, 3, null, null]";
        assertEquals(expected, algo.serialize(testTree));
    }

    @Test
    public void testDeserialize() throws Exception {
        String exam = "[1, 2, null, null, 3, null, null]";
        assertTrue(new IsSameTree().isSameTree(testTree, algo.deserialize(exam)));
    }
}

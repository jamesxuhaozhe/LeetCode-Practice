package tree.flattenbinarytree;

import datastructure.TreeNode;
import org.junit.Before;
import org.junit.Test;
import tree.sametree.IsSameTree;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 1/21/16.
 */
public class FlattenBinaryTreeTest {
    private FlattenBinaryTree algo;
    private TreeNode tree;

    @Before
    public void setUp() throws Exception {
        algo = new FlattenBinaryTree();
        tree = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        tree.left = node2;
        tree.right = node5;
        node2.left = node3;
        node2.right = node4;
        node5.right = node6;
    }

    @Test
    public void testFlattenBinaryTree() throws Exception {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        node1.right = node2;
        node2.right = node3;
        node3.right = node4;
        node4.right = node5;
        node5.right = node6;
        assertTrue(new IsSameTree().isSameTree(node1, algo.flattenBinaryTree(tree)));
    }
}

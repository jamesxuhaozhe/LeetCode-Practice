package tree.validatebinarysearchtree;

import datastructure.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 1/18/16.
 */
public class ValidateBinarySearchTreeTest {
    private ValidateBinarySearchTree algo;
    private TreeNode validBST;
    private TreeNode inValidBST;

    @Before
    public void setUp() throws Exception {
        algo = new ValidateBinarySearchTree();
        validBST = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        validBST.left = node2;
        validBST.right = node4;

        inValidBST = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        inValidBST.left = node1;
        inValidBST.right = node3;
    }

    @Test
    public void testValidToBeTrue() throws Exception {
        assertTrue(algo.isValidBST(validBST));
    }

    @Test
    public void testValidToBeFalse() throws Exception {
        assertFalse(algo.isValidBST(inValidBST));
    }
}

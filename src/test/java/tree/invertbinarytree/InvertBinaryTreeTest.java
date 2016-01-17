package tree.invertbinarytree;

import datastructure.TreeNode;
import org.junit.Before;
import org.junit.Test;
import tree.sametree.IsSameTree;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 1/17/16.
 */
public class InvertBinaryTreeTest {
    private IsSameTree treeTool;
    private InvertBinaryTree algo;
    private TreeNode expectedTree;
    private TreeNode beforetree;

    @Before
    public void setUp() throws Exception {
        treeTool = new IsSameTree();
        algo = new InvertBinaryTree();
        expectedTree = new TreeNode(4);
        beforetree = new TreeNode(4);
        TreeNode node2e = new TreeNode(2);
        TreeNode node7e = new TreeNode(7);
        TreeNode node1e = new TreeNode(1);
        TreeNode node3e = new TreeNode(3);
        TreeNode node6e = new TreeNode(6);
        TreeNode node9e = new TreeNode(9);

        expectedTree.left = node7e;
        expectedTree.right = node2e;
        node7e.left = node9e;
        node7e.right = node6e;
        node2e.left = node3e;
        node2e.right = node1e;

        TreeNode node2b = new TreeNode(2);
        TreeNode node7b = new TreeNode(7);
        TreeNode node1b = new TreeNode(1);
        TreeNode node3b = new TreeNode(3);
        TreeNode node6b = new TreeNode(6);
        TreeNode node9b = new TreeNode(9);

        beforetree.left = node2b;
        beforetree.right = node7b;
        node2b.left = node1b;
        node2b.right = node3b;
        node7b.left = node6b;
        node7b.right = node9b;

    }

    @Test
    public void testInvertBinaryTree() throws Exception {
        assertTrue(treeTool.isSameTree(expectedTree, algo.invertBinaryTree(beforetree)));
    }
}

package tree.lowestcommonancestorbst;

import datastructure.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 1/17/16.
 */
public class BSTlowestcommonancestorTest {
    private BSTlowestcommonancestor algo;

    @Before
    public void setUp() throws Exception {
        algo = new BSTlowestcommonancestor();
    }

    @Test
    public void testBSTLowestcommonancestor() throws Exception {
        TreeNode node6 = new TreeNode(6);
        TreeNode node2 = new TreeNode(2);
        TreeNode node8 = new TreeNode(8);
        TreeNode node0 = new TreeNode(0);
        TreeNode node7 = new TreeNode(7);
        TreeNode node9 = new TreeNode(9);
        node6.left = node2;
        node6.right = node8;
        node2.left = node0;
        node8.left = node7;
        node8.right = node9;
        assertEquals(node6, algo.getLowestCommonAncestor(node6, node0, node9));
        assertEquals(node8, algo.getLowestCommonAncestor(node8, node7, node9));
    }

}

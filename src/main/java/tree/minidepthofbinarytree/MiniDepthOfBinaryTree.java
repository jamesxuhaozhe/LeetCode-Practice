package tree.minidepthofbinarytree;

import datastructure.TreeNode;

/**
 * Created by haozhexu on 1/17/16.
 */
public class MiniDepthOfBinaryTree {
    public int getMiniDepth(TreeNode root) {
        return root == null ? 0 : getMin(root);
    }

    private int getMin(TreeNode node) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return Math.min(getMin(node.left), getMin(node.right)) + 1;
    }
}

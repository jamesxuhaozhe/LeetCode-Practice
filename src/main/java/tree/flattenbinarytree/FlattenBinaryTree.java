package tree.flattenbinarytree;

import datastructure.TreeNode;

/**
 * Created by haozhexu on 1/21/16.
 */
public class FlattenBinaryTree {
    public TreeNode flattenBinaryTree(TreeNode root) {
        return flattenBinaryTreeHelper(root, null);
    }

    private TreeNode flattenBinaryTreeHelper(TreeNode root, TreeNode pre) {
        if (root == null) {
            return pre;
        }
        pre = flattenBinaryTreeHelper(root.right, pre);
        pre = flattenBinaryTreeHelper(root.left, pre);
        root.right = pre;
        root.left = null;
        pre = root;
        return pre;
    }

}

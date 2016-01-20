package tree.lowestcommonancestorbinarytree;

import datastructure.TreeNode;

/**
 * Created by haozhexu on 1/20/16.
 */
public class LowestCommonAncestorBinaryTree {

    public static void main(final String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node1.left = node2;
        node1.right = node3;
        TreeNode ans = new LowestCommonAncestorBinaryTree().lowestCommonAncestor(node1, node2, node3);
        System.out.println(ans.val);
    }
    private boolean covers(TreeNode node, TreeNode p) {
        if (node == null) {
            return false;
        }
        if (node == p) {
            return true;
        }
        return covers(node.left, p) || covers(node.right, p);
    }
    private TreeNode helper(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return root;
        }
        if (root == p || root == q) {
            return root;
        }
        boolean is_p_on_left = covers(root.left, p);
        boolean is_q_on_left = covers(root.left, q);
        if (is_p_on_left != is_q_on_left) {
            return root;
        }
        TreeNode child_node = is_p_on_left ? root.left : root.right;
        return helper(child_node, p, q);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (!covers(root, p) || !covers(root, q)) {
            return null;
        }
        return helper(root, p, q);
    }
}

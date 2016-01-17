package tree.lowestcommonancestorbst;

import datastructure.TreeNode;

/**
 * Created by haozhexu on 1/17/16.
 */
public class BSTlowestcommonancestor {
    public TreeNode getLowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val < root.val && q.val < root.val) {
            return getLowestCommonAncestor(root.left, p, q);
        }
        if (p.val > root.val && q.val > root.val) {
            return getLowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}

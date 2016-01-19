package tree.binarytreepath;

import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haozhexu on 1/18/16.
 */
public class BinaryTreePath {
    public List<String> binaryTreePath(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        if (root.left == null && root.right == null) {
            result.add(Integer.toString(root.val));
            return result;
        }
        if (root.left != null) {
            createPath(root.left, Integer.toString(root.val), result);
        }
        if (root.right != null) {
            createPath(root.right, Integer.toString(root.val), result);
        }
        return result;
    }

    private void createPath(TreeNode node, String current, List<String> result) {
        current += "->" + Integer.toString(node.val);
        if (node.left == null && node.right == null) {
            result.add(current);
        }
        if (node.left != null) {
            createPath(node.left, current, result);
        }
        if (node.right != null) {
            createPath(node.right, current, result);
        }
    }
}

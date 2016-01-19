package tree.serialanddeserializebinarytree;

import datastructure.TreeNode;

import java.util.*;

/**
 * Created by haozhexu on 1/19/16.
 */
public class SerializeAndDeseBinaryTree {
    // Encodes a tree to a single string.

    public static void main(final String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        System.out.println(new SerializeAndDeseBinaryTree().serialize(root));
    }
    public String serialize(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        serializeHelper(root, result);
        return result.toString();
    }

    private void serializeHelper(TreeNode root, List<Integer> result) {
        if (root == null) {
            result.add(null);
            return;
        }
        result.add(root.val);
        serializeHelper(root.left, result);
        serializeHelper(root.right, result);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] vals = data.substring(1, data.length() - 1).split(", ");
        Deque<String> deque = new LinkedList<>(Arrays.asList(vals));
        return deserializeHelper(deque);
    }

    private TreeNode deserializeHelper(Deque<String> deque) {
        if (deque.size() == 0) {
            return null;
        }
        String str = deque.pop();
        if (str.equals("null")) {
            return null;
        }
        int currentNum = Integer.parseInt(str);
        TreeNode currentNode = new TreeNode(currentNum);
        currentNode.left = deserializeHelper(deque);
        currentNode.right = deserializeHelper(deque);
        return currentNode;
    }
}

package tree.bstiterator;

import datastructure.TreeNode;

import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * Created by haozhexu on 1/20/16.
 */
public class BSTIterator {
    private Stack<TreeNode> stack;
    private TreeNode currentNode;

    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        currentNode = root;
    }

    public boolean hasNext() {
        return !stack.isEmpty() || currentNode != null;
    }

    public int next() {
        while (hasNext()) {
            if (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                TreeNode temp = stack.pop();
                currentNode = temp.right;
                return temp.val;
            }
        }
        throw new NoSuchElementException();
    }
}

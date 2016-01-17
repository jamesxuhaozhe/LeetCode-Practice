package datastructure;


/**
 * Created by haozhexu on 1/17/16.
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) {
        val = x;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }
}

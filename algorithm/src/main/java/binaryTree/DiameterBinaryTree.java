package binaryTree;

/**
 *  543 二叉树的直径
 */

public class DiameterBinaryTree {

    public int diameterBinaryTree(TreeNode root) {
        int left =  traverse(root.left);
        int right = traverse(root.right);
        return left+right;
    }

    int traverse(TreeNode root) {
        if(root==null) {
            return 0;
        }

        int left = traverse(root.left);
        int right = traverse(root.right);
        return 1+Math.max(left, right);
    }
}

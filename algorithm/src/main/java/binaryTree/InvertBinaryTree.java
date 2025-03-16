package binaryTree;

/**
 *  226 翻转二叉树
 */

public class InvertBinaryTree {

    public void invertBinaryTree(TreeNode root) {
        traverse(root);
    }

    void traverse(TreeNode root) {
        if(root==null) {
            return;
        }


        TreeNode temp = null;
        temp = root.left;
        root.left = root.right;
        root.right = temp;

        traverse(root.left);
        traverse(root.right);

    }
}

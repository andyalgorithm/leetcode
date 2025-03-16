package binaryTree;

/**
 *  111 二叉树最小深度
 */

public class MinimumDepthBinaryTree {

    int minimumDepthBinaryTree(TreeNode root) {
        int res = 0;
        res = traverse(root);
        return res;
    }

    int traverse(TreeNode root) {
        if(root==null) {
            return 0;
        }

        int left = traverse(root.left)+1;
        int right = traverse(root.right)+1;
        return Math.min(left, right);
    }

}

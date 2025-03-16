package binaryTree;

import java.util.LinkedList;

/**
 *  145 二叉树的后续遍历
 */

public class BinaryTreePostorderTraversal {
    LinkedList<Integer> binaryTreePostorderTraversal(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<>();

        traverse(root, res);

        return res;
    }

    void traverse(TreeNode root, LinkedList<Integer> res) {
        if(root==null) {
            return;
        }
        traverse(root.left, res);
        traverse(root.right, res);
        res.addFirst(root.val);
    }


}

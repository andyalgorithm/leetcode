package binaryTree;

import java.util.ArrayList;

/**
 *  102 二叉树层序遍历
 */

public class BinaryTreeLevelOrderTraversal {

    ArrayList<ArrayList<Integer>> binaryTreeLevelOrderTraversal(TreeNode root) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        traverse(root, 0, res);
        return res;
    }

    void traverse(TreeNode root, int level, ArrayList<ArrayList<Integer>> res) {
        if(root==null) {
            return;
        }
        if(level>=res.size()) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);

        traverse(root.left, level+1, res);
        traverse(root.right, level+1, res);
    }
}

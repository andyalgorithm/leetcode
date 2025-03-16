package binaryTree;

import java.util.LinkedList;

/**
 *  114 二叉树展开为链表
 */

public class FlattenBinaryTreeToLinkedList {

    LinkedList<TreeNode> flattenBinaryTreeToLinkedList(TreeNode root) {
        LinkedList<TreeNode> res = new LinkedList<>();
        traverse(root, res);
        // 重新排列
        for(int i=0; i<res.size()-1; i++) {
            TreeNode t = res.get(i);
            t.left = null;
            t.right = res.get(i+1);
        }
        return res;
    }

    void traverse(TreeNode root, LinkedList<TreeNode> res) {
        if(root==null) {
            return;
        }
//        if(res.size()>0) {
//            TreeNode last = res.getLast();
//            last.left = null;
//            last.right = root;
//        }
        res.add(root);
        traverse(root.left, res);
        traverse(root.right, res);

    }
}

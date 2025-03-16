package binaryTree;

/**
 * [103. 二叉树的锯齿形层序遍历]
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {

    public LinkedList<LinkedList<Integer>> zigzagOrder(TreeNode root) {
        LinkedList<LinkedList<Integer>> res = new LinkedList<>();

        traverse(root, 0, res);
        return res;
    }

    void traverse(TreeNode root, int level, LinkedList<LinkedList<Integer>> res) {
        if(root==null) {
            return;
        }
        if(level>=res.size()) {
//            System.out.println(root.val);
            res.add(new LinkedList<>());
        }

        // 偶数层从左到右，奇数层从右到左
        if(level%2==1) {
            res.get(level).addFirst(root.val);
        }else {
            res.get(level).add(root.val);
        }

        traverse(root.left, level+1, res);
        traverse(root.right, level+1, res);
    }
}

package BFS_DFS;

import binaryTree.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *  103. 二叉树锯齿形层序遍历
 */

public class BinaryTreeZigzagLevelOrderTraversal {

    public ArrayList<ArrayList<Integer>> binaryTreeZigzagLevelOrderTraversal(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        if(root==null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        // 用于记录遍历方向
        boolean leftToRight = false;
        while(!queue.isEmpty()) {
            int size = queue.size();

            ArrayList<Integer> temp = new ArrayList<>();

            for(int i=0; i<size; i++) {
                TreeNode cur = queue.poll();
                temp.add(cur.val);

                if(cur.left!=null) {
                    if(leftToRight) {
                        queue.offer(cur.left);
                    } else {
                        queue.offer(cur.right);
                    }

                    if(leftToRight) {
                        queue.offer(cur.right);
                    } else {
                        queue.offer(cur.left);
                    }
                }
            }
            res.add(temp);

            // 改变遍历方向
            leftToRight = !leftToRight;
        }

        return res;
    }
}

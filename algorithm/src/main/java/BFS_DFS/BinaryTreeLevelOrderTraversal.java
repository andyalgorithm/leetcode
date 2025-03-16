package BFS_DFS;

import binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *  102. 二叉树层序遍历
 */

public class BinaryTreeLevelOrderTraversal {

    public ArrayList<ArrayList<Integer>> binaryTreeLevelOrderTraversal(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        // 设置一个队列，队列中存放根节点
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            // 将当前队列中的所有节点向四周扩散
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0; i<size; i++) {
                // 获取当前节点
                TreeNode cur = queue.poll();
                temp.add(cur.val);

                // 添加到队列中
                if(cur.left != null) {
                    queue.add(cur.left);
                }
                if(cur.right != null) {
                    queue.add(cur.right);
                }
            }
            res.add(temp);
        }


        return res;
    }



}

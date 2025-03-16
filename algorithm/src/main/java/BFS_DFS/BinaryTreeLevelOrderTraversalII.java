package BFS_DFS;

/**
 * 107 二叉树的层序遍历 II
 */

import binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {

    public ArrayList<ArrayList<Integer>> binaryTreeLevelOrderTraverseII(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> temp = new ArrayList<>();

            for(int i=0; i<size; i++) {
                TreeNode cur = queue.poll();
                temp.add(cur.val);

                if(cur.left!=null) {
                    queue.offer(cur.left);
                }
                if(cur.right!=null) {
                    queue.offer(cur.right);
                }
            }

            res.add(0, temp);
        }

        return  res;
    }


}

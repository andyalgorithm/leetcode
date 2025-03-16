package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 102. ⼆叉树的层序遍历
 */

public class LevelOrderTraversal {



    LinkedList<LinkedList<Integer>> levelOrderTraversal(TreeNode root) {
        LinkedList<LinkedList<Integer>> res = new LinkedList<>();

        if(root == null) {
            return res;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root); // 添加二叉树
        while(!q.isEmpty()) {
            int sz = q.size();
            // 记录下这一层节点值
            LinkedList<Integer> temp = new LinkedList<>();
            // for循环控制每一层从左向右遍历
            for(int i=0;i<sz;i++) {
                TreeNode curr = q.poll(); // 弹出二叉树节点
                temp.add(curr.val);
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
                res.add(temp);
            }
        }
        return res;
    }



}

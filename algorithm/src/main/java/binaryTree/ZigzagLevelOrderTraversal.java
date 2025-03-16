package binaryTree;

/**
 * [103. 二叉树的锯齿形层序遍历]
 */

import java.util.LinkedList;
import java.util.Queue;

public class ZigzagLevelOrderTraversal {

    public LinkedList<LinkedList<Integer>> zigzagOrder(TreeNode root) {
        LinkedList<LinkedList<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }

        Queue<TreeNode> q = new LinkedList<>();
        boolean flag = false;
        q.offer(root); // 添加

        while (!q.isEmpty()) {
            int sz = q.size();
            LinkedList<Integer> temp = new LinkedList<>();
            for (int i = 0; i < sz; i++) {
                TreeNode curr = q.poll(); // 弹出
                if (!flag) {
                    temp.addFirst(curr.val);
                }else {
                    temp.addLast(curr.val);
                }
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
            flag = !flag;
            res.add(temp);
        }
        return res;
    }
}

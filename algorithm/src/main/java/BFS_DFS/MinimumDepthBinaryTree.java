package BFS_DFS;

import binaryTree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 111. 二叉树的最小深度
 */

public class MinimumDepthBinaryTree {

    public int minimumDepthBinaryTree(TreeNode root) {
        int res = 0;

        if(root==null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        res += 1;

        while (!queue.isEmpty()) {
            int sz = queue.size();

            for(int i=0; i<sz; i++) {
                TreeNode cur = queue.poll();
                if(cur.left==null || cur.right==null) {
                    return res;
                }
            }

            res += 1;
        }

        return res;
    }
}

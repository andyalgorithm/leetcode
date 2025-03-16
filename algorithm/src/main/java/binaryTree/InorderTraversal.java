package binaryTree;

import java.util.LinkedList;
import java.util.List;

/**
 * 94. ⼆叉树的中序遍历
 */

public class InorderTraversal {
    /* 回溯算法思路*/
    LinkedList<Integer> res = new LinkedList<>();


    // 中序遍历结果
    public List<Integer> inorderTraversal(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<>();
        if(root == null) {
            return res;
        }

        res.addAll(inorderTraversal(root.left));
        res.add(root.val);
        res.addAll(inorderTraversal(root.right));
        return res;
    }

    // 返回前序遍历结果
    public List<Integer> preorderTraversal(TreeNode root) {
        traverse(root);
        return res;
    }

    // 二叉树遍历函数
    void traverse(TreeNode root) {
        if(root == null) {
            return;
        }

        traverse(root.left);
        //中序遍历
        res.add(root.val);
        traverse(root.right);
    }

}

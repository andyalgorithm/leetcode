package binaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    static LinkedList<Integer> res = new LinkedList<>();

    public TreeNode() {}

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static LinkedList<Integer> treeNodeToNum(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<>();
        preorderTraversal(root, list);
        return list;
    }

    // 返回前序遍历结果
    static void preorderTraversal(TreeNode root, LinkedList<Integer> res) {
        if(root==null) {
            return;
        }
        res.add(root.val);
        preorderTraversal(root.left, res);
        preorderTraversal(root.right, res);
    }

    // 二叉树遍历函数
    static void traverse(TreeNode root) {
        if(root == null) {
            return;
        }

        traverse(root.left);
        //中序遍历
        res.add(root.val);
        traverse(root.right);
    }

    public static TreeNode numsToTreeNode (int[] nums) {
        if(nums.length==0) {
            return null;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(nums[0]);
        queue.add(root);

        for(int index=1; index< nums.length;) {
            int size = queue.size();
            for(int i=0; i<size; i+=1) {
                TreeNode curr = queue.poll();
                if(nums[index]!=-1) {
                    curr.left = new TreeNode(nums[index]);
                    queue.add(curr.left);

                }
                index += 1;
                if(nums[index]!=-1) {
                    curr.right = new TreeNode(nums[index]);
                    queue.add(curr.right);
                }
                index += 1;
            }
        }

        return root;
    }
}

package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *  297 二叉树的序列化和反序列化
 */

public class SerializeAndDeserializeBinaryTree {

    public String serialize(TreeNode root) {
        StringBuilder res = new StringBuilder();
        serializeTraverse(root, res);

        // 删除最后一个字符
        res.deleteCharAt(res.length()-1);

        return res.toString();
    }

    void serializeTraverse(TreeNode root, StringBuilder res) {
        if(root==null) {
            res.append("null").append(",");
            return;
        }
        res.append(Integer.toString(root.val)).append(",");
        serializeTraverse(root.left, res);
        serializeTraverse(root.right, res);
    }

    public TreeNode deserialize(String str) {
        LinkedList<String> list = new LinkedList<>();
        for(String t : str.split(",")) {
            list.add(t);
        }

        TreeNode res = deserializeTraverse(list);

        return res;
    }

    TreeNode deserializeTraverse(LinkedList<String> list) {
        // 采用后序遍历
        if(list.isEmpty()) {
            return null;
        }

        String first = list.removeFirst();
        if(first.equals("null")) {
            return null;
        }

        // 前序创建节点
        int val = Integer.parseInt(first);

        TreeNode root = new TreeNode(val);

        //后续关联节点
        root.left = deserializeTraverse(list);
        root.right = deserializeTraverse(list);
        return root;


    }
}

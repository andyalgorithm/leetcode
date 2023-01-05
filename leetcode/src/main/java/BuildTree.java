import java.util.HashMap;

/**
 * 105 重建二叉树
 */

public class BuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length!=inorder.length || preorder.length==0){
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        TreeNode root = dp(0, 0, inorder.length-1, preorder, map);
        return root;
    }

    TreeNode dp(int pos, int left, int right, int[] preorder, HashMap<Integer, Integer> map){
        // 递归终止
        if(left>right){
            return null;
        }

        // 建立根节点
        TreeNode node = new TreeNode(preorder[pos]);
        // 划分根节点、左子树、右子树
        int i = map.get(preorder[pos]);
        // 开启左子树递归
        node.left = dp(pos+1, left, i-1, preorder, map);
        // 开启右子树递归
        node.right = dp(pos+i-left+1, i+1, right, preorder, map);

        return node;
    }
}

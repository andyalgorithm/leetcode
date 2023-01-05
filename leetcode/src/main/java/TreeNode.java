import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public static TreeNode numsToTree(int[] nums){
        if(nums.length==0){
            return null;
        }
        TreeNode root = new TreeNode(nums[0]);
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int start=1;
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(start<nums.length){
                node.left = new TreeNode(nums[start]);
                queue.offer(node.left);
                start++;
            }
            if(start<nums.length){
                node.right = new TreeNode(nums[start]);
                queue.offer(node.right);
                start++;
            }
        }

        return root;
    }


    public static List<Integer> treeNodeToNum(TreeNode root){
        List<Integer> res = new ArrayList<>();
        dp2(root, res);
        return res;
    }

    static void dp2(TreeNode root, List<Integer> res){
        if(root==null){
            return;
        }
        res.add(root.val);
        dp2(root.left, res);
        dp2(root.right, res);
    }


}

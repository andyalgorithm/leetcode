import java.util.LinkedList;
import java.util.List;

/**
 * 113. 二叉树中和为某一值的路径
 */

public class PathSum {
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> res = new LinkedList<>();
        dp(root, target, new LinkedList<Integer>(), (LinkedList)res);

        return res;
    }

    void dp(TreeNode root, int target, LinkedList<Integer> temp, LinkedList<LinkedList<Integer>> res){
        if(target==0 && temp.size()>0){
            res.add(new LinkedList<>(temp));
        }
        if(root==null){
            return;
        }

        temp.add(root.val);
        dp(root.left, target-root.val, temp, res);
        temp.removeLast();
        temp.add(root.val);
        dp(root.right, target-root.val, temp, res);
        temp.removeLast();
    }
}

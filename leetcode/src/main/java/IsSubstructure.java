import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 剑指offer 26. 树的子结构
 */

public class IsSubstructure {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A==null || B==null){
            return false;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(A);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.val==B.val){
                if(dp(node, B)){
                    return true;
                }
            }
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }

        return false;
    }

    boolean dp(TreeNode a, TreeNode b){
        if(b==null){
            return true;
        }else if(a==null){
            return false;
        }

        if(a.val!=b.val){
            return false;
        }

        return dp(a.left, b.left) && dp(a.right, b.right);
    }
}

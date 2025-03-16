package binaryTree;

/**
 * 100. 相同的树
 */

public class SameTree {

    boolean sameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) {
            return true;
        }else if(p==null || q==null) {
            return false;
        }else if(p.val!=q.val) {
            return false;
        }
        return sameTree(p.left, q.left) && sameTree(p.right, q.right);
    }
}

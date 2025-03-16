package binaryTree;

/**
 * 100. 相同的树
 */

public class SameTree2 {

    boolean sameTree(TreeNode p, TreeNode q) {

        return traverse(p, q);
    }

    boolean traverse(TreeNode p, TreeNode q) {
        if(p==null && q==null) {
            return true;
        }else if(p==null || q==null) {
            return false;
        }

        if(p.val!=q.val) {
            return false;
        }

        boolean res =  traverse(p.left, q.left) && traverse(p.right, q.right);

        return res;
    }

}

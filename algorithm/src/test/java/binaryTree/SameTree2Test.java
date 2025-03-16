package binaryTree;

import org.junit.Test;

public class SameTree2Test {

    SameTree2 solver = new SameTree2();

    @Test
    public void testOne() {
        int[] nums1 = new int[] {1,2,3};
        int[] nums2 = new int[] {1,2,3};
        TreeNode p = TreeNode.numsToTreeNode(nums1);
        TreeNode q = TreeNode.numsToTreeNode(nums2);
        boolean res = solver.sameTree(p, q);
        System.out.println(res);
        // true
    }
}

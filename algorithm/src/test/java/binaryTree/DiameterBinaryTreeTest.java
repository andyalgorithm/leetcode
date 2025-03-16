package binaryTree;

import org.junit.Test;

public class DiameterBinaryTreeTest {

    DiameterBinaryTree solver = new DiameterBinaryTree();

    @Test
    public void testOne() {
        int[] nums = new int[] {1,2,3,4,5,-1,-1};
        TreeNode root = TreeNode.numsToTreeNode(nums);
        int res = solver.diameterBinaryTree(root);
        System.out.println(res);
        // 3
    }
}

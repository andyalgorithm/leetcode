package binaryTree;

import org.junit.Test;

public class MinimumDepthBinaryTreeTest {

    MinimumDepthBinaryTree solver = new MinimumDepthBinaryTree();

    @Test
    public void testOne() {
        int[] nums = new int[] {3,9,20,-1,-1,15,7};
        TreeNode root = TreeNode.numsToTreeNode(nums);
        int res = solver.minimumDepthBinaryTree(root);
        System.out.println(res);
        // 2
    }
}

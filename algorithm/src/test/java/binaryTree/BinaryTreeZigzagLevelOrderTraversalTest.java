package binaryTree;

import org.junit.Test;

import java.util.LinkedList;

public class BinaryTreeZigzagLevelOrderTraversalTest {

    BinaryTreeZigzagLevelOrderTraversal solver = new BinaryTreeZigzagLevelOrderTraversal();

    @Test
    public void testOne() {
        int[] nums = new int[] {3, 9, 20, -1, -1, 15, 7};
        TreeNode root = TreeNode.numsToTreeNode(nums);
        LinkedList<LinkedList<Integer>> res = solver.zigzagOrder(root);
        for(LinkedList<Integer> t: res) {
            System.out.println(t);
        }
        /**
         * [3]
         * [20, 9]
         * [15, 7]
         */
    }
}

package BSF_DSF;


import BFS_DFS.BinaryTreeZigzagLevelOrderTraversal;
import binaryTree.TreeNode;
import org.junit.Test;

import java.util.ArrayList;

public class BinaryTreeZigzagLevelOrderTraversalTest {


        BinaryTreeZigzagLevelOrderTraversal solver = new BinaryTreeZigzagLevelOrderTraversal();

        @Test
        public void testOne() {
            int[] nums = new int[] {3, 9, 20, -1, -1, 15, 7};
            TreeNode root = TreeNode.numsToTreeNode(nums);
            ArrayList<ArrayList<Integer>> res = solver.binaryTreeZigzagLevelOrderTraversal(root);

            for(ArrayList<Integer> t: res) {
                System.out.println(t);
                /**
                 * [3]
                 * [20, 9]
                 * [15, 7]
                 */
        }
    }

    @Test
    public void testTwo() {
        int[] nums = new int[] {3};
        TreeNode root = TreeNode.numsToTreeNode(nums);
        ArrayList<ArrayList<Integer>> res = solver.binaryTreeZigzagLevelOrderTraversal(root);

        for(ArrayList<Integer> t: res) {
            System.out.println(t);
            /**
             * [3]
             */
        }
    }

    @Test
    public void testThree() {
        int[] nums = new int[] {};
        TreeNode root = TreeNode.numsToTreeNode(nums);
        ArrayList<ArrayList<Integer>> res = solver.binaryTreeZigzagLevelOrderTraversal(root);

        for(ArrayList<Integer> t: res) {
            System.out.println(t);
            /**
             * 空
             */
        }
    }



}

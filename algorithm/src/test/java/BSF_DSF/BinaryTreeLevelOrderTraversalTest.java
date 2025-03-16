package BSF_DSF;

import BFS_DFS.BinaryTreeLevelOrderTraversal;
import binaryTree.TreeNode;
import org.junit.Test;

import java.util.ArrayList;

public class BinaryTreeLevelOrderTraversalTest {

    BinaryTreeLevelOrderTraversal solver = new BinaryTreeLevelOrderTraversal();

    @Test
    public void testOne() {
        int[] nums = new int[] {3,9,20,-1,-1,15,7};
        TreeNode root = TreeNode.numsToTreeNode(nums);
        ArrayList<ArrayList<Integer>> res = solver.binaryTreeLevelOrderTraversal(root);
        for(ArrayList<Integer> t: res) {
            System.out.println(t);
            /**
             * [
             *  [3],
             *  [9,20],
             *  [15,7]
             * ]
             */
        }

    }
}

package BSF_DSF;

import BFS_DFS.BinaryTreeLevelOrderTraversalII;
import BFS_DFS.BinaryTreeZigzagLevelOrderTraversal;
import binaryTree.TreeNode;
import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;
import org.junit.Test;

import java.util.ArrayList;

public class BinaryTreeLevelOrderTraversalIITest {

    BinaryTreeLevelOrderTraversalII solver = new BinaryTreeLevelOrderTraversalII();

    @Test
    public void testOne() {
        int[] nums = new int[] {3,9,30,-1,-1,15,7};
        TreeNode root = TreeNode.numsToTreeNode(nums);
        ArrayList<ArrayList<Integer>> res = solver.binaryTreeLevelOrderTraverseII(root);
        for(ArrayList<Integer> t: res) {
            System.out.println(t);
            /**
             * [15, 7]
             * [9, 30]
             * [3]
             */
        }
    }
}

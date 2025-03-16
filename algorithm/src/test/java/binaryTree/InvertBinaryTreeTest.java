package binaryTree;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class InvertBinaryTreeTest {

    InvertBinaryTree solver = new InvertBinaryTree();

    @Test
    public void testOne() {
        int[] nums = new int[] {4,2,7,1,3,6,9};
        TreeNode root = TreeNode.numsToTreeNode(nums);
        solver.invertBinaryTree(root);
        LinkedList<Integer> res = TreeNode.treeNodeToNum(root);
        System.out.println(res);
        // [4, 7, 9, 6, 2, 3, 1]
    }
}

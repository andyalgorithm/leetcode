package binaryTree;

import org.junit.Test;

import java.util.LinkedList;

public class FlattenBinaryTreeToLinkedListTest {

    FlattenBinaryTreeToLinkedList solver = new FlattenBinaryTreeToLinkedList();

    @Test
    public void testOne() {
        int[] nums = new int[] {1,2,5,3,4,-1,6};
        TreeNode root = TreeNode.numsToTreeNode(nums);
        LinkedList<TreeNode> res = solver.flattenBinaryTreeToLinkedList(root);
        for(TreeNode t: res) {
            System.out.print(t.val+" ");
        }
        // 1 2 3 4 5 6
    }
}

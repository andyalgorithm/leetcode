package binaryTree;

import org.junit.Test;

import java.util.LinkedList;

public class SerializeAndDeserializeBinaryTreeTest {
    SerializeAndDeserializeBinaryTree solver = new SerializeAndDeserializeBinaryTree();

    @Test
    public void testOne() {
        String root = "1,2,3,null,null,4,5";
        TreeNode res = solver.deserialize(root);
        LinkedList<Integer> nums = TreeNode.treeNodeToNum(res);
        System.out.println(nums.toString());
        // [1, 2, 3, 4, 5]

        String str = solver.serialize(res);
        System.out.println(str);
        // 1,2,3,null,null,4,5,null,null,null,null
    }
}

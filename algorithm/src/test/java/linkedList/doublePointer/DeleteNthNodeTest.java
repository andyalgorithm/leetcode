package linkedList.doublePointer;

import org.junit.Assert;
import org.junit.Test;

public class DeleteNthNodeTest {

    private DeleteNthNode list = new DeleteNthNode();

    @Test
    public void test1() {
        int[] nums = new int[] {1,2,3,4,5};
        ListNode l = ListNode.numsToListNode(nums);
        ListNode resList = list.deleteNthNode(l, 6);
        int[] res = ListNode.listNodeToNum(resList);
        Assert.assertArrayEquals(new int[]{1,2,3,4,5}, res);
    }

    @Test
    public void test2() {
        int[] nums = new int[] {1,2,3,4,5};
        ListNode l = ListNode.numsToListNode(nums);
        ListNode resList = list.deleteNthNode(l, 2);
        int[] res = ListNode.listNodeToNum(resList);
        Assert.assertArrayEquals(new int[]{1,2,3,5}, res);
    }
}

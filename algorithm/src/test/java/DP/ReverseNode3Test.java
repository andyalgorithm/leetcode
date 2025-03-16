package DP;

import linkedList.doublePointer.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class ReverseNode3Test {

    ReverseNode3 reverse = new ReverseNode3();

    @Test
    public void test1() {
        int[] nums = new int[]{1,2,3,4,5,6};
        ListNode list = ListNode.numsToListNode(nums);
        ListNode resList = reverse.reverseBetween(list, 0, 0);
        int[] res = ListNode.listNodeToNum(resList);
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6}, res);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{1,2,3,4,5,6};
        ListNode list = ListNode.numsToListNode(nums);
        ListNode resList = reverse.reverseBetween(list, 2, 4);
        int[] res = ListNode.listNodeToNum(resList);
        Assert.assertArrayEquals(new int[]{1,2,4,3,5,6}, res);
    }

    @Test
    public void test3() {
        int[] nums = new int[]{1,2,3,4,5,6};
        ListNode list = ListNode.numsToListNode(nums);
        ListNode resList = reverse.reverseBetween(list, 2, 7);
        int[] res = ListNode.listNodeToNum(resList);
        Assert.assertArrayEquals(new int[]{1,2,6,5,4,3}, res);
    }


}

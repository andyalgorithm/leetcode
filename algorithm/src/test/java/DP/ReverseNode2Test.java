package DP;

import linkedList.doublePointer.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class ReverseNode2Test {

    ReverseNode2 reverse = new ReverseNode2();

    @Test
    public void test1() {
        int[] nums = new int[]{1,2,3,4,5,6};
        ListNode list = ListNode.numsToListNode(nums);
        ListNode resList = reverse.reverseNode(list, 0);
        int[] res = ListNode.listNodeToNum(resList);
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6}, res);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{1,2,3,4,5,6};
        ListNode list = ListNode.numsToListNode(nums);
        ListNode resList = reverse.reverseNode(list, 5);
        int[] res = ListNode.listNodeToNum(resList);
        Assert.assertArrayEquals(new int[]{5,4,3,2,1,6}, res);
    }

    @Test
    public void test3() {
        int[] nums = new int[]{1,2,3,4,5,6};
        ListNode list = ListNode.numsToListNode(nums);
        ListNode resList = reverse.reverseNode(list, 7);
        int[] res = ListNode.listNodeToNum(resList);
        Assert.assertArrayEquals(new int[]{6,5,4,3,2,1}, res);
    }
}

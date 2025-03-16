package DP;

/**
 * 206. 反转链表
 */

import linkedList.doublePointer.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class ReverseNodeTest {

    private ReverseNode list = new ReverseNode();

    @Test
    public void test1() {
        int[] nums = new int[] {1,2,3,4,5};
        ListNode l = ListNode.numsToListNode(nums);
        ListNode resList = list.reverseNode(l);
        int[] res = ListNode.listNodeToNum(resList);
        Assert.assertArrayEquals(new int[]{5,4,3,2,1}, res);
    }

    @Test
    public void test2() {
        int[] nums = new int[] {};
        ListNode l = ListNode.numsToListNode(nums);
        ListNode resList = list.reverseNode(l);
        int[] res = ListNode.listNodeToNum(resList);
        Assert.assertArrayEquals(new int[]{}, res);
    }
}

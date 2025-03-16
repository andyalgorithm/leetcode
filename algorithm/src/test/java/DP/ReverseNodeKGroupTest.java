package DP;

import linkedList.doublePointer.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class ReverseNodeKGroupTest {

    ReverseNodeKGroup reverse = new ReverseNodeKGroup();

    @Test
    public void test1() {
        int[] nums = new int[]{1,2,3,4,5,6};
        ListNode list = ListNode.numsToListNode(nums);
        ListNode resList = reverse.reverseNodeKGroup(list, 2);
        int[] res = ListNode.listNodeToNum(resList);
        Assert.assertArrayEquals(new int[]{2,1,4,3,6,5}, res);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{1,2,3,4,5,6};
        ListNode list = ListNode.numsToListNode(nums);
        ListNode resList = reverse.reverseNodeKGroup(list,4);
        int[] res = ListNode.listNodeToNum(resList);
        Assert.assertArrayEquals(new int[]{4,3,2,1,5,6}, res);
    }
}

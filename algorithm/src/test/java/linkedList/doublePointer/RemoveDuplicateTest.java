package linkedList.doublePointer;

/**
 * 23. 合并K个有序链表
 */

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicateTest {
    private RemoveDuplicate re = new RemoveDuplicate();

    @Test
    public void test1() {
        int[] nums = new int[] {1,4,5};
        ListNode list = ListNode.numsToListNode(nums);

        ListNode resListNode = re.remove(list);
        int[] res = ListNode.listNodeToNum(resListNode);
        Assert.assertArrayEquals(new int[]{1,4,5}, res);
    }

    @Test
    public void test2() {
        int[] nums = new int[] {1,1,3,4,4,5};
        ListNode list = ListNode.numsToListNode(nums);

        ListNode resListNode = re.remove(list);
        int[] res = ListNode.listNodeToNum(resListNode);
        Assert.assertArrayEquals(new int[]{1,3,4,5}, res);
    }

    @Test
    public void test3() {
        int[] nums = new int[] {};
        ListNode list = ListNode.numsToListNode(nums);

        ListNode resListNode = re.remove(list);
        int[] res = ListNode.listNodeToNum(resListNode);
        Assert.assertArrayEquals(new int[]{}, res);
    }

}

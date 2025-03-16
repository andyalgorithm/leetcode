package linkedList.doublePointer;

/**
 * 23. 合并K个有序链表
 */

import org.junit.Assert;
import org.junit.Test;

public class MergeKSortedListTest {
    private MergeKSortedList list = new MergeKSortedList();

    @Test
    public void test1() {
        int[] nums1 = new int[] {1,4,5};
        int[] nums2 = new int[] {1,3,4};
        int[] nums3 = new int[] {2,6};
        ListNode l1 = ListNode.numsToListNode(nums1);
        ListNode l2 = ListNode.numsToListNode(nums2);
        ListNode l3 = ListNode.numsToListNode(nums3);
        ListNode resListNode = list.mergeKListNode(new ListNode[] {l1,l2,l3});
        int[] res = ListNode.listNodeToNum(resListNode);
        Assert.assertArrayEquals(new int[]{1,1,2,3,4,4,5,6}, res);
    }

    @Test
    public void test2() {
        int[] nums1 = new int[] {};
        int[] nums2 = new int[] {};
        int[] nums3 = new int[] {};
        ListNode l1 = ListNode.numsToListNode(nums1);
        ListNode l2 = ListNode.numsToListNode(nums2);
        ListNode l3 = ListNode.numsToListNode(nums3);
        ListNode resListNode = list.mergeKListNode(new ListNode[] {l1,l2,l3});
        int[] res = ListNode.listNodeToNum(resListNode);
        Assert.assertArrayEquals(new int[]{}, res);
    }

}

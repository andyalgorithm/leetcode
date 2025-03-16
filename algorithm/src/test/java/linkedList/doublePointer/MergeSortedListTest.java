package linkedList.doublePointer;

import org.junit.Assert;
import org.junit.Test;


public class MergeSortedListTest {

    private MergeSortedList merge = new MergeSortedList();

    @Test
    public void test1() {
        int[] nums1 = new int[] {1,2,4};
        int[] nums2 = new int[] {1,3,4};
        ListNode l1 = ListNode.numsToListNode(nums1);
        ListNode l2 = ListNode.numsToListNode(nums2);
        ListNode m = merge.mergeSortedList(l1, l2);
        int[] res = ListNode.listNodeToNum(m);
        Assert.assertArrayEquals(new int[]{1,1,2,3,4,4}, res);
    }

    @Test
    public void test2() {
        int[] nums1 = new int[] {};
        int[] nums2 = new int[] {};
        ListNode l1 = ListNode.numsToListNode(nums1);
        ListNode l2 = ListNode.numsToListNode(nums2);
        ListNode m = merge.mergeSortedList(l1, l2);
        int[] res = ListNode.listNodeToNum(m);
        Assert.assertArrayEquals(new int[]{}, res);
    }

    @Test
    public void test3() {
        int[] nums1 = new int[] {};
        int[] nums2 = new int[] {0};
        ListNode l1 = ListNode.numsToListNode(nums1);
        ListNode l2 = ListNode.numsToListNode(nums2);
        ListNode m = merge.mergeSortedList(l1, l2);
        int[] res = ListNode.listNodeToNum(m);
        Assert.assertArrayEquals(new int[]{0}, res);
    }
}

package linkedList.doublePointer;

import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersTest {

    private AddTwoNumbers add = new AddTwoNumbers();

    public ListNode numsToListNode(int[] nums) {
        ListNode dummy = new ListNode(-1);

        // 创建链表
        ListNode p = dummy;
        for(int n : nums) {
            p.next = new ListNode(n);
            p = p.next;
        }
        return dummy.next;
    }

    public int[] listNodeToNums(ListNode l) {
        int size = 0;
        ListNode p = l;
        while(l!=null) {
            size++;
            l = l.next;
        }
        int[] nums = new int[size];

        size=0;
        l = p;
        while(l!=null) {
            nums[size] = l.val;
            l = l.next;
            size++;
        }
        return nums;
    }

    @Test
    public void test1() {
        int[] nums1 = new int[] {2,4,3};
        int[] nums2 = new int[] {5,6,4};
        ListNode l1 = numsToListNode(nums1);
        ListNode l2 = numsToListNode(nums2);

        ListNode list = add.addTwoNumbers(l1, l2);

        int[] res = listNodeToNums(list);
        Assert.assertArrayEquals(new int[]{7,0,8}, res);
    }

    @Test
    public void test2() {
        int[] nums1 = new int[] {0};
        int[] nums2 = new int[] {0};
        ListNode l1 = numsToListNode(nums1);
        ListNode l2 = numsToListNode(nums2);

        ListNode list = add.addTwoNumbers(l1, l2);

        int[] res = listNodeToNums(list);
        Assert.assertArrayEquals(new int[]{0}, res);
    }

    @Test
    public void test3() {
        int[] nums1 = new int[] {9,9,9,9,9,9,9};
        int[] nums2 = new int[] {9,9,9,9};
        ListNode l1 = numsToListNode(nums1);
        ListNode l2 = numsToListNode(nums2);

        ListNode list = add.addTwoNumbers(l1, l2);

        int[] res = listNodeToNums(list);
        Assert.assertArrayEquals(new int[]{8,9,9,9,0,0,0,1}, res);
    }
}

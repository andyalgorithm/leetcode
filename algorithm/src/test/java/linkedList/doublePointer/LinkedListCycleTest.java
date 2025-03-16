package linkedList.doublePointer;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListCycleTest {

    private LinkedListCycle cycle = new LinkedListCycle();

    public ListNode numsToListNode(int[] nums, int pos) {
        ListNode dummy = new ListNode(-1);
        ListNode temp= new ListNode(-1);

        // 创建链表
        ListNode p = dummy;
        for(int i=0; i<nums.length; i++) {
            p.next = new ListNode(nums[i]);
            p = p.next;
            if(pos==i) {
                temp = p;
            }
        }

        if(0<= pos && pos<nums.length) {
            p.next = temp;
        }
        return dummy.next;
    }


    @Test
    public void test1() {
        int[] nums = new int[]{3,2,0,-4};
        ListNode list = numsToListNode(nums, 1);
        boolean cy = cycle.linkedListCycle(list);
        Assert.assertTrue(cy);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{3,2,0,-4};
        ListNode list = numsToListNode(nums, -1);
        boolean cy = cycle.linkedListCycle(list);
        Assert.assertFalse(cy);
    }




}

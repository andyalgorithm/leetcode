package linkedList.doublePointer;

/**
 * 141. 环形链表
 * // 使用快慢指针解题
 */

public class LinkedListCycle {

    public boolean linkedListCycle(ListNode l) {
        if(l==null && l.next==null) {
            return false;
        }

        ListNode slow=l,fast=l.next;
        boolean cycle = false;

        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next;
            fast = fast.next;
            if(slow==fast) {
                cycle = true;
                break;
            }
        }
        return cycle;
    }
}

package linkedList.doublePointer;

/**
 * 142. 环形链表 II
 * 这道题属于数学知识+快慢指针
 */

public class LinkedListCycleII {

    public int linkedListCycle(ListNode l) {
        int pos = -1;
        ListNode slow=l, fast=l;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next;
            fast = fast.next;
            if(slow==fast) {
                pos = 0;
                slow = l;
                while(slow!=fast) {
                    slow = slow.next;
                    fast = fast.next;
                    pos++;
                    return pos;
                }
            }
        }
        return pos;
    }

}

package linkedList.doublePointer;

/**
 * 83. 删除排序链表中的重复元素
 */

public class RemoveDuplicate {

    ListNode remove(ListNode head) {
        ListNode slow=head, fast=head;
        while(fast!=null) {
            if(slow.val==fast.val) {
                fast = fast.next;
            } else {
                slow.next = fast;
                slow = fast;
            }
        }
        return head;
    }
}

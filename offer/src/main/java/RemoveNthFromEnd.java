/**
 * 021/19 删除链表的倒数第N个节点
 */

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast=dummy;
        ListNode slow = dummy;
        for(int i=0; i<=n; i++) {
            fast = fast.next;
        }

        while(fast!=null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }

}

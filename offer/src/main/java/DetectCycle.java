/**
 * 022/142 链表中环的入口节点
 */

public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head, fast=head;
        while(fast!=null) {
            slow = slow.next;
            if(fast.next==null || fast.next.next==null) {
                return null;
            }
            fast = fast.next.next;
            if(slow==fast) {
                break;
            }
        }

        slow = head;
        while (slow!=fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}

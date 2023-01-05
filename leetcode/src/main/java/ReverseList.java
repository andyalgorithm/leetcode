/**
 * 206 反转链表
 */

public class ReverseList {

    public ListNode reverseList(ListNode head) {
        ListNode res = dp(head);
        return res;
    }

    ListNode dp(ListNode head) {
        if(head==null || head.next==null) {
            return head;
        }

        ListNode last = dp(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
}

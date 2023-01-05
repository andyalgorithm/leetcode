/**
 *  24 两两交换链表中的节点
 */

public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode res =  dp(head);

        return res;
    }

    ListNode dp(ListNode head){
        if(head==null || head.next==null){
            return head;
        }

        ListNode newHead = head.next;
        head.next = dp(head.next.next);
        newHead.next = head;

        return newHead;
    }
}

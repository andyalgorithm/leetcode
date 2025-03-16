/**
 * 023/160 两个链表的第一个重合点
 */

public class IntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA;
        ListNode l2 = headB;

        // headA-headB与headB-headA一定会有交点，最不济交点为null
        while(l1 != l2) {
            l1 = l1.next;
            l2 = l2.next;
            if(l1==null && l2==null) {
                return null;
            }else if(l1==null) {
                l1=headB;
            }else if(l2==null) {
                l2=headA;
            }
        }
        return l1;
    }

}

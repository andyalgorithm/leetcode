package linkedList.doublePointer;

/**
 * 21. 合并两个有序链表
 */

import linkedList.doublePointer.ListNode;

public class MergeSortedList {

    public ListNode mergeSortedList(ListNode l1, ListNode l2) {
        ListNode p1=l1, p2=l2, dummy=new ListNode(-1);
        ListNode p = dummy;
        while(p1!=null || p2!=null) {
            if(p1!=null && p2!=null) {
                if(p1.val<p2.val) {
                    p.next = p1;
                    p1 = p1.next;
                }else {
                    p.next = p2;
                    p2 = p2.next;
                }
                p = p.next;
            }else if(p2==null) {
                p.next = p1;
                p1 = null;
            }else if(p1==null) {
                p.next = p2;
                p2 = null;
            }
        }
        return dummy.next;
    }
}

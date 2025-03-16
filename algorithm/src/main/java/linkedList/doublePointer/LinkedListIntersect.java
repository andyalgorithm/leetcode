package linkedList.doublePointer;

/**
 * 160. 相交链表
 */


import linkedList.doublePointer.ListNode;

public class LinkedListIntersect {

    public ListNode intersect(ListNode l1, ListNode l2) {
        ListNode p1=l1, p2=l2;
        while(p1!=p2) {
            if(p1==null) {
                p1 = l2;
            }else{
                p1 = p1.next;
            }
            if(p2==null) {
                p2 = l1;
            }else{
                p2 = p2.next;
            }
        }
        return p1;
    }
}

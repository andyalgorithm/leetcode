package DP;

import linkedList.doublePointer.ListNode;

public class ReverseNode3 {

    private ListNode successor=null;

    public ListNode reverseBetween(ListNode list, int m, int n) {
        if(list==null || m<0 || n<0 || m>=n) {
            return list;
        }

        ListNode p=list;
        for(int i=0;i<m-1;i++) {
            p = p.next;
        }
        ListNode last = reverse(p.next, n-m);
        p.next = last;

        return list;
    }

    public ListNode reverse(ListNode list, int n) {
        if(list==null || list.next==null || n<=1) {
            successor = list.next;
            return list;
        }

        ListNode last = reverse(list.next, n-1);
        list.next.next = list;
        list.next = successor;

        return last;
    }
}

package DP;

// 反转链表

import linkedList.doublePointer.ListNode;

public class ReverseNode {

    public ListNode reverseNode(ListNode list) {
        if(list==null || list.next==null) {
            return list;
        }
        ListNode last = reverseNode(list.next);
        list.next.next = list;
        list.next = null;
        return last;
    }
}

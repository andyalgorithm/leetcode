package DP;

/**
 * 25. K 个一组翻转链表
 */

import linkedList.doublePointer.ListNode;

public class ReverseNodeKGroup {

    public ListNode reverseNodeKGroup(ListNode list, int k) {
        if(list == null) {
            return null;
        }
        ListNode start=list, end=list;
        for(int i=0;i<k;i++) {
            // 不足 k 个，不需要反转，base case
            if (end == null) {
                return start;
            }
            end = end.next;
        }

        // 反转前 k 个元素
        ListNode t = reverse(start, end);
        start.next = reverseNodeKGroup(end, k);

        return t;
    }

    // 反转区间内的链表，左闭右开 [a, b)
    public ListNode reverse(ListNode a, ListNode b) {
        if(a.next==b) {
            return a;
        }
        ListNode last = reverse(a.next, b);
        a.next.next = a;
        a.next = null;

        return last;
    }

}

package DP;

import linkedList.doublePointer.ListNode;

/**
 *  对题目 [206. 反转链表]的扩展
 * 反转链表前N个节点
 */

public class ReverseNode2 {

    ListNode successor = null; // 后驱节点

    public ListNode reverseNode(ListNode list, int n) {
        if(list==null || list.next==null || n<=1) {
            successor = list.next;
            return list;
        }
        ListNode last = reverseNode(list.next, n-1);
        list.next.next = list;
        list.next = successor;

        return last;
    }
}

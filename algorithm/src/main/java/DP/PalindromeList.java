package DP;

import linkedList.doublePointer.ListNode;

/**
 * 234. 回⽂链表
 *
 * 快慢指针
 */


public class PalindromeList {

    public boolean palindrome(ListNode head) {
        if(head==null) {
            return true;
        }
        boolean res = true;
        boolean even = false; // 默认为奇数

        ListNode slow=head, fast=head;

        // 首先获取中间节点，并判断个数的奇偶性
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            if(fast.next.next==null) {
                even = true;
            }
            fast = fast.next.next;
        }

        if(even) {
            fast = slow;
        }else {
            fast = slow.next;
        }

        fast = reverse(fast);
        slow = head;



        // 判断是否为回文链表
        while(fast!=null) {
            if(slow.val!=fast.val) {
                res = false;
                break;
            }
            slow = slow.next;
            fast = fast.next;
        }

        return res;
    }

    public ListNode reverse(ListNode head) {
        if(head==null || head.next==null) {
            return head;
        }
        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
}

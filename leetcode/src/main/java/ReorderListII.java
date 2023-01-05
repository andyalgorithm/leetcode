import java.util.LinkedList;
import java.util.Stack;

/**
 *  026/143 重排链表
 */

public class ReorderListII {
    public void reorderList(ListNode head) {
        ListNode middle = findMiddle(head);
        Stack<ListNode> stack = new Stack<>();
        while (middle != null) {
            stack.push(middle);
            middle = middle.next;
        }

        ListNode left = head;
        ListNode right;
        while (!stack.isEmpty()) {
            ListNode temp = left.next;
            right = stack.pop();
            left.next = right;
            right.next = temp;
            left = temp;
        }

    }


    ListNode findMiddle(ListNode head) {
        ListNode slow=new ListNode(-1, head);
        ListNode fast=slow;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 阶段中点
        ListNode res = slow.next;
        slow.next = null;
        return res;
    }
}

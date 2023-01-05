/**
 * 82. 删除排序链表中的重复元素II
 */

public class DeleteDuplicatesII {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode res = dp(head);

        return res;
    }

    ListNode dp(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        // 不相等
        if (slow.val != fast.val) {
            slow.next = dp(fast);
            return slow;
        } else {
            while (fast!=null && fast.val == slow.val) {
                fast = fast.next;
            }
            return dp(fast);
        }
    }
}

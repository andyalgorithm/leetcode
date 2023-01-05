/**
 * 83. 删除排序链表中的重复元素
 */

public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1000, head);
        ListNode slow = dummy, fast = dummy.next;
        while (fast!=null){
            slow.next = fast;
            slow = slow.next;
            while (fast!=null && slow.val==fast.val){
                fast = fast.next;
            }
        }
        // 截断末尾
        slow.next = null;
        return dummy.next;
    }


}

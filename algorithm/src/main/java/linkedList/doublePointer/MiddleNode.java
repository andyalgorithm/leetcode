package linkedList.doublePointer;

/**
 * 876 链表的中间节点
 */

public class MiddleNode {

    public ListNode middleNode(ListNode list) {
        if(list==null) {
            return null;
        }
        ListNode slow=list, fast=list;

        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}

package linkedList.doublePointer;

/**
 * 19. 删除链表的倒数第 N 个结点 �
 */

public class DeleteNthNode {

    public ListNode deleteNthNode(ListNode list, int n) {
        ListNode slow = list, fast = list;

        // 快指针先走 n 步
        for(int i=0;i<=n;i++) {
            if(fast==null) {
                return list;
            }
            fast = fast.next;
        }

        // 快慢指针同时走，直到快指针到结尾处
        while(fast!=null) {
            fast = fast.next;
            slow = slow.next;
        }

        if(slow.next!=null) {
            slow.next = slow.next.next;
        }

        return list;
    }
}

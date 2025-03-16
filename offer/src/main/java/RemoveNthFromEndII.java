import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 021/19 删除链表的倒数第N个节点
 */

public class RemoveNthFromEndII {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Queue<ListNode>  queue= new LinkedList<>();
        int count = 0;
        while(head!=null) {
            queue.add(head);
            head = head.next;
            count++;
        }

        ListNode dummy = new ListNode(-1);
        ListNode curr  =dummy;
        while(!queue.isEmpty()){
            ListNode temp = queue.poll();
            // 清除弹出节点的next值，这一步很有必要
            temp.next = null;

            if(count!=n) {
                curr.next = temp;
                curr = curr.next;
            }
            count--;
        }
        return dummy.next;
    }

}

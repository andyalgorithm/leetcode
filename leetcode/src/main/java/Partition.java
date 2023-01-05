import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 86. 分隔链表
 */

public class Partition {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        ListNode pos = head;
        Queue<ListNode> queue = new LinkedBlockingQueue<>();
        while (pos!=null){
            if(pos.val<x){
                cur.next = pos;
                cur = cur.next;
            }else{
                queue.add(pos);
            }
            pos = pos.next;
        }

        while (!queue.isEmpty()){
            cur.next = queue.poll();
            cur = cur.next;
        }

        // 截断末尾
        cur.next = null;

        return dummy.next;
    }
}

import java.util.PriorityQueue;

/**
 * 23. 合并K个升序链表
 */

public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>((a, b) -> {
            return a.val-b.val;
        });
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        for(ListNode t: lists){
            while(t!=null){
                queue.add(t);
                t = t.next;
            }
        }

        while (!queue.isEmpty()){
            curr.next = queue.poll();
            curr = curr.next;
        }
        curr.next = null;

        return dummy.next;
    }
}

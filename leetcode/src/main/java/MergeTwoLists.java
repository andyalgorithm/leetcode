import java.util.PriorityQueue;

/**
 * 21 合并两个有序链表
 */

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 从小到大排序
        PriorityQueue<ListNode> queue = new PriorityQueue<>(2, (a, b) -> {
            return a.val-b.val;
        });

        if(list1==null) {
            return list2;
        }
        if(list2==null) {
            return list1;
        }

        while (list1!=null) {
            ListNode temp = list1;
            queue.offer(temp);
            list1 = list1.next;
        }

        while(list2!=null) {
            ListNode temp = list2;
            queue.offer(temp);
            list2 = list2.next;
        }


        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while(!queue.isEmpty()) {
            curr.next = queue.poll();
            curr = curr.next;
        }
        curr.next = null;

        return dummy.next;

    }

}

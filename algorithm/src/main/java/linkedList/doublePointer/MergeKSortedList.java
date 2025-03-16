package linkedList.doublePointer;

import java.util.PriorityQueue;

/**
 * 23. 合并K个有序链表
 */

public class MergeKSortedList {

    public ListNode mergeKListNode(ListNode[] lists) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        // 从小到大排列。优先级队列，最小堆，堆的容量等于链表的个数(K)
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
                lists.length,(a,b) -> (a.val-b.val));

        for(ListNode header : lists) {
            if(header!=null) {
                pq.add(header);
            }
        }

        while(!pq.isEmpty()) {
            ListNode node = pq.poll();
            p.next = node;
            p = p.next;
            if(node.next!=null) {
                pq.add(node.next);
            }
        }

        return dummy.next;

    }
}

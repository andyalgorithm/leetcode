import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 *  026/143 重排链表
 */

public class ReorderList {
    public void reorderList(ListNode head) {
        LinkedList<ListNode> list = new LinkedList<>();
        while(head!=null) {
            list.add(head);
            // 清除指针
//            list.getLast().next = null;
            head = head.next;
        }

        int left=1, right=list.size()-1;
        while(left<right) {
            ListNode last = list.removeLast();
            list.add(left, last);
            left+=2;
        }

        for(int i=0; i<list.size()-1; i++) {
            list.get(i).next = list.get(i+1);
        }

        // 防止出现环
        list.getLast().next = null;
        head = list.getFirst();
    }
}

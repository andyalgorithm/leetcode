import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 1171. 从链表中删去总和值为零的连续节点
 */

public class RemoveZeroSumSublists {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        int sum = 0;
        ListNode cur = dummy;

        HashMap<Integer, ListNode> map = new HashMap<>();

        // 第一次遍历，存储前置和。如果有多个和相同，存储最后一个值
        while (cur!=null){
            sum += cur.val;
            map.put(sum, cur);
            cur = cur.next;
        }

        cur = dummy;
        sum = 0;
        while (cur!=null){
            sum += cur.val;
            cur.next = map.get(sum).next;
            cur = cur.next;
        }
        return dummy.next;
    }
}

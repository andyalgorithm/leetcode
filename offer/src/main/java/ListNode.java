import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode numToList(int[] nums) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        for(int n: nums) {
            curr.next = new ListNode(n);
            curr = curr.next;
        }
        return dummy.next;
    }

    public static List<Integer> listToArrayList(ListNode head) {
        List<Integer> arr = new ArrayList<Integer>();
        while (head!=null) {
            arr.add(head.val);
            head = head.next;
        }
        return arr;
    }

    public static ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while (l1!=null) {
            curr.next = l1;
            curr = curr.next;
            l1 = l1.next;
        }

        while (l2!=null) {
            curr.next = l2;
            curr = curr.next;
            l2 = l2.next;
        }

        return dummy.next;
    }
}

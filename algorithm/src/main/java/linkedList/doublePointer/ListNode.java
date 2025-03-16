package linkedList.doublePointer;

public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {}
    public ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode numsToListNode(int[] nums) {
        ListNode dummy = new ListNode(-1);
        ListNode p=dummy;
        for(int n: nums) {
            p.next = new ListNode(n);
            p = p.next;
        }
        return dummy.next;
    }

    public static int[] listNodeToNum(ListNode l) {
        int size = 0;
        ListNode p = l;
        while(p!=null) {
            size++;
            p = p.next;
        }

        int[] nums = new int[size];
        p = l;
        for(int i=0;i<size;i++) {
            nums[i] = p.val;
            p = p.next;
        }
        return nums;
    }

}

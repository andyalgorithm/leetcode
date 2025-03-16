import org.junit.Test;

public class DetectCycleTest {
    DetectCycle solver = new DetectCycle();

    @Test
    public void test1() {
        int[] nums = {1,2};
        ListNode head = ListNode.numToList(nums);
        head.next.next=head;
        ListNode res = solver.detectCycle(head);
        System.out.println(res.val);
        // 1
    }

    @Test
    public void test2() {
        int[] nums = {1};
        ListNode head = ListNode.numToList(nums);
        ListNode res = solver.detectCycle(head);
        System.out.println(res);
        // null
    }

}



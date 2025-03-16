import org.junit.Test;

public class RemoveNthFromEndTest {
    RemoveNthFromEnd solver = new RemoveNthFromEnd();

    @Test
    public void test1() {
        int[] nums = {1,2,3,4,5};
        ListNode head = ListNode.numToList(nums);
        ListNode res = solver.removeNthFromEnd(head, 2);
        System.out.println(ListNode.listToArrayList(res));
        // [1, 2, 3, 5]
    }

    @Test
    public void test2() {
        int[] nums = {1};
        ListNode head = ListNode.numToList(nums);
        ListNode res = solver.removeNthFromEnd(head, 1);
        System.out.println(ListNode.listToArrayList(res));
        // []
    }

    @Test
    public void test3() {
        int[] nums = {1,2};
        ListNode head = ListNode.numToList(nums);
        ListNode res = solver.removeNthFromEnd(head, 1);
        System.out.println(ListNode.listToArrayList(res));
        // [1]
    }

    @Test
    public void test4() {
        int[] nums = {1,2};
        ListNode head = ListNode.numToList(nums);
        ListNode res = solver.removeNthFromEnd(head, 2);
        System.out.println(ListNode.listToArrayList(res));
        // [2]
    }


}

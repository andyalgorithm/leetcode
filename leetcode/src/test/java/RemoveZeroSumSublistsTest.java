import org.junit.Test;

public class RemoveZeroSumSublistsTest {
    RemoveZeroSumSublists solver = new RemoveZeroSumSublists();

    @Test
    public void test1(){
        int[] nums = {1,2,-3,3,1};
        ListNode head = ListNode.numToList(nums);
        ListNode res = solver.removeZeroSumSublists(head);
        System.out.println(ListNode.listToArrayList(res));
        // [3, 1]
    }

    @Test
    public void test2(){
        int[] nums = {1,2,3,-3,4};
        ListNode head = ListNode.numToList(nums);
        ListNode res = solver.removeZeroSumSublists(head);
        System.out.println(ListNode.listToArrayList(res));
        // [1, 2, 4]
    }

    @Test
    public void test3(){
        int[] nums = {1,2,3,-3,-2};
        ListNode head = ListNode.numToList(nums);
        ListNode res = solver.removeZeroSumSublists(head);
        System.out.println(ListNode.listToArrayList(res));
        // [1]
    }

    @Test
    public void test4(){
        int[] nums = {1,3,2,-3,-2,5,5,-5,1};
        ListNode head = ListNode.numToList(nums);
        ListNode res = solver.removeZeroSumSublists(head);
        System.out.println(ListNode.listToArrayList(res));
        // [1, 5, 1]
    }
}

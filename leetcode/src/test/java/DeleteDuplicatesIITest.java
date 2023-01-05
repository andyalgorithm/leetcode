import org.junit.Test;

public class DeleteDuplicatesIITest {
    DeleteDuplicatesII solver = new DeleteDuplicatesII();

    @Test
    public void test1(){
        int[] nums = {1,2,3,3,4,4,5};
        ListNode head = ListNode.numToList(nums);
        ListNode res = solver.deleteDuplicates(head);
        System.out.println(ListNode.listToArrayList(res));
        // [1, 2, 5]
    }

    @Test
    public void test2(){
        int[] nums = {1,1,1,2,3};
        ListNode head = ListNode.numToList(nums);
        ListNode res = solver.deleteDuplicates(head);
        System.out.println(ListNode.listToArrayList(res));
        // [2, 5]
    }

    @Test
    public void test3(){
        int[] nums = {1,1};
        ListNode head = ListNode.numToList(nums);
        ListNode res = solver.deleteDuplicates(head);
        System.out.println(ListNode.listToArrayList(res));
        // []
    }
}

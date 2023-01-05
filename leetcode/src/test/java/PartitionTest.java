import org.junit.Test;

public class PartitionTest {
    Partition solver = new Partition();

    @Test
    public void test1(){
        int[] nums = {1,4,3,2,5,2};
        ListNode head = ListNode.numToList(nums);
        int x = 3;
        ListNode res = solver.partition(head, x);
        System.out.println(ListNode.listToArrayList(res));
        // [1, 2, 2, 4, 3, 5]
    }

    @Test
    public void test2(){
        int[] nums = {2,1};
        ListNode head = ListNode.numToList(nums);
        int x = 2;
        ListNode res = solver.partition(head, x);
        System.out.println(ListNode.listToArrayList(res));
        // [1, 2]
    }
}

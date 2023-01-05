import org.junit.Test;

public class ReorderListTest {
    ReorderList solver = new ReorderList();

    @Test
    public void test1() {
        ListNode head = ListNode.numToList(new int[]{1,2,3,4});
        solver.reorderList(head);
        System.out.println(ListNode.listToArrayList(head));
        // [1, 4, 2, 3]
    }

    @Test
    public void test2() {
        ListNode head = ListNode.numToList(new int[]{1,2,3,4,5});
        solver.reorderList(head);
        System.out.println(ListNode.listToArrayList(head));
        // [1, 5, 2, 4, 3]
    }
}

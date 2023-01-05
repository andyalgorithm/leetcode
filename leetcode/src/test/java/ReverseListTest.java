import org.junit.Test;

public class ReverseListTest {

    ReverseList solver = new ReverseList();

    @Test
    public void test1() {
        ListNode head = ListNode.numToList(new int[]{1,2,3,4,5});
        ListNode res = solver.reverseList(head);
        System.out.println(ListNode.listToArrayList(res));
    }
}

import org.junit.Test;

public class MergeTwoListsTest {
    MergeTwoLists solver = new MergeTwoLists();

    @Test
    public void test1() {
        ListNode list1 = ListNode.numToList(new int[] {1});
        ListNode list2 = ListNode.numToList(new int[] {});
        ListNode res = solver.mergeTwoLists(list1, list2);
        System.out.println(ListNode.listToArrayList(res));
    }
}

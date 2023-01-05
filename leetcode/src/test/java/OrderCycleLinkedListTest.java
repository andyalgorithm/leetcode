import org.junit.Test;

public class OrderCycleLinkedListTest {
    OrderCycleLinkedList solver = new OrderCycleLinkedList();

    @Test
    public void test1() {
        int[] nums = {3,4,1};
        Node head = Node.numsToNode(nums);
        Node res = solver.insert(head, 2);
        System.out.println(Node.nodeToLinkedList(res));
    }

    @Test
    public void test2() {
        int[] nums = {};
        Node head = Node.numsToNode(nums);
        Node res = solver.insert(head, 1);
        System.out.println(Node.nodeToLinkedList(res));
    }

    @Test
    public void test3() {
        int[] nums = {1};
        Node head = Node.numsToNode(nums);
        Node res = solver.insert(head, 0);
        System.out.println(Node.nodeToLinkedList(res));
    }
}

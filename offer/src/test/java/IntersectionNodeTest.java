import org.junit.Test;

import java.util.List;

public class IntersectionNodeTest {
    IntersectionNode solver = new IntersectionNode();

    @Test
    public void test1() {
        ListNode common = ListNode.numToList(new int[]{8,4,5});
        ListNode headA = ListNode.numToList(new int[]{4,1});
        ListNode headB = ListNode.numToList(new int[]{5,0,1});
        headA = ListNode.merge(headA, common);
        headB = ListNode.merge(headB, common);
        ListNode res = solver.getIntersectionNode(headA, headB);
        System.out.println(res.val);
        // 8
    }

    @Test
    public void test2() {
        ListNode common = ListNode.numToList(new int[]{});
        ListNode headA = ListNode.numToList(new int[]{2,6,4});
        ListNode headB = ListNode.numToList(new int[]{1,5});
        headA = ListNode.merge(headA, common);
        headB = ListNode.merge(headB, common);
        ListNode res = solver.getIntersectionNode(headA, headB);
        System.out.println(res);
        // null
    }
}

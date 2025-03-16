package linkedList.doublePointer;

import org.junit.Assert;
import org.junit.Test;

public class MiddleNodeTest {

    private MiddleNode middle = new MiddleNode();

    @Test
    public void test1() {
        int[] nums = new int[] {1,2,3,4,5};
        ListNode l = ListNode.numsToListNode(nums);
        ListNode resNode = middle.middleNode(l);
        int[] res = ListNode.listNodeToNum(resNode);
        Assert.assertArrayEquals(new int[]{3,4,5}, res);

    }

    @Test
    public void test2() {
        int[] nums = new int[] {1,2,3,4,5,6};
        ListNode l = ListNode.numsToListNode(nums);
        ListNode resNode = middle.middleNode(l);
        int[] res = ListNode.listNodeToNum(resNode);
        Assert.assertArrayEquals(new int[]{4,5,6}, res);

    }
}

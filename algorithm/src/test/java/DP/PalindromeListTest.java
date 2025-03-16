package DP;


import linkedList.doublePointer.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeListTest {

    private PalindromeList p = new PalindromeList();

    @Test
    public void test1() {
        int[] nums = new int[] {1,2,2,1};
        ListNode l = ListNode.numsToListNode(nums);
        boolean res = p.palindrome(l);
        Assert.assertTrue(res);
    }

    @Test
    public void test2() {
        int[] nums = new int[] {1,2,3,2,1};
        ListNode l = ListNode.numsToListNode(nums);
        boolean res = p.palindrome(l);
        Assert.assertTrue(res);
    }

    @Test
    public void test3() {
        int[] nums = new int[] {1,1};
        ListNode l = ListNode.numsToListNode(nums);
        boolean res = p.palindrome(l);
        Assert.assertTrue(res);
    }

    @Test
    public void test4() {
        int[] nums = new int[] {1, 2};
        ListNode l = ListNode.numsToListNode(nums);
        boolean res = p.palindrome(l);
        Assert.assertFalse(res);
    }

    @Test
    public void test5() {
        int[] nums = new int[] {1};
        ListNode l = ListNode.numsToListNode(nums);
        boolean res = p.palindrome(l);
        Assert.assertTrue(res);
    }

    @Test
    public void test6() {
        int[] nums = new int[] {};
        ListNode l = ListNode.numsToListNode(nums);
        boolean res = p.palindrome(l);
        Assert.assertTrue(res);
    }
}

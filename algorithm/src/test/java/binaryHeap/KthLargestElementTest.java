package binaryHeap;

import org.junit.Assert;
import org.junit.Test;
import org.omg.CORBA.INTERNAL;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElementTest {

    private KthLargestElement large = new KthLargestElement();

    @Test
    public void test1() {
        int[] nums = new int[] {3,2,1,5,6,4};
        int k=2;
        int expect = 5;
        int res = large.kthLargest(nums, k);
        Assert.assertEquals(expect, res);
    }

}

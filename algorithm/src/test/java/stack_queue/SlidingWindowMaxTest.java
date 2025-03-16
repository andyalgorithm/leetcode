package stack_queue;

import org.junit.Assert;
import org.junit.Test;

public class SlidingWindowMaxTest {

    private SlidingWindowMax max = new SlidingWindowMax();


    @Test
    public void test1() {
        int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
        int k =3;
        int[] expect = new int[] {3,3,5,5,6,7};
        int[] res = max.slidingWindowMax(nums, k);
        Assert.assertArrayEquals(expect, res);
    }



}

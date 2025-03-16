package array.slideWIndow;

import org.junit.Assert;
import org.junit.Test;
import array.slideWindow.SlidingWindowMaximum;

public class SlidingWindowMaximumTest {

    private SlidingWindowMaximum max = new SlidingWindowMaximum();

    @Test
    public void maximumWindowTest1() {
        int[] nums = new int[] {1,3,-1,-3,5,3,6,7};
//        int[] res = max.maximumWindow(nums, 3);
        int[] res = max.maximumWindow2(nums, 3);
        Assert.assertArrayEquals(new int[]{3,3,5,5,6,7}, res);
    }
}

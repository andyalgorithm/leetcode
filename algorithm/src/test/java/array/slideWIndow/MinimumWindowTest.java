package array.slideWIndow;

import org.junit.Assert;
import org.junit.Test;
import array.slideWindow.MinimumWindow;

public class MinimumWindowTest {

    private MinimumWindow min = new MinimumWindow();

    @Test
    public void maximumWindowTest1() {
        int[] nums = new int[] {1,3,-1,-3,5,3,6,7};
        int[] res = min.minimumWindow(nums, 3);
        Assert.assertArrayEquals(new int[]{-1,-3,-3,-3,3,3}, res);
    }

    @Test
    public void maximumWindowTest2() {
        int[] nums = new int[] {1,3,-1,-3,5,3,6,7};
        int[] res = min.minimumWindow(nums, 2);
        Assert.assertArrayEquals(new int[]{1,-1,-3,-3,3,3,6}, res);
    }
}

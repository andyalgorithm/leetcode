package array.binarySearch;

import org.junit.Assert;
import org.junit.Test;

public class PeakArrayTest {

    private PeakArray peak = new PeakArray();

    @Test
    public void peakArrayTest1() {
        int[] nums = new int[] {};
        int res = peak.peakArray(nums);
        Assert.assertEquals(res, -1);
    }

    @Test
    public void peakArrayTest2() {
        int[] nums = new int[] {1,3,5,7,6};
        int res = peak.peakArray(nums);
        Assert.assertEquals(res, 3);
    }

    @Test
    public void peakArrayTest3() {
        int[] nums = new int[] {0,1,0};
        int res = peak.peakArray(nums);
        Assert.assertEquals(res, 1);
    }
}

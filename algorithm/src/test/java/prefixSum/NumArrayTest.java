package prefixSum;

import org.junit.Assert;
import org.junit.Test;

public class NumArrayTest {

    @Test
    public void test1() {
        int[] nums = new int[] {-2, 0, 3, -5, 2, -1};
        NumArray array = new NumArray(nums);
        int res;
        res = array.sumRange(0,2);
        Assert.assertEquals(1, res);

        res = array.sumRange(2,5);
        Assert.assertEquals(-1, res);

        res = array.sumRange(0,5);
        Assert.assertEquals(-3, res);
    }

}

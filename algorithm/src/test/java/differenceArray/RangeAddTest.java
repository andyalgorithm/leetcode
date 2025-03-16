package differenceArray;

import org.junit.Assert;
import org.junit.Test;

public class RangeAddTest {

    private RangeAdd add = new RangeAdd();

    @Test
    public void test1() {
        int[][] nums = new int[][] {
                {1,3,2},
                {2,4,3},
                {0,2,-2}
        };

        int[] res = add.rangeAdd(nums, 5);
        Assert.assertArrayEquals(new int[]{-2,0,3,5,3}, res);
    }
}

package differenceArray;

import org.junit.Assert;
import org.junit.Test;

public class CarPoolingTest {

    private CarPooling pool = new CarPooling();

    @Test
    public void test1() {
        int[][] nums = new int[][]{
                {2,1,5},
                {3,3,7}
        };
        boolean res = pool.carPooling(nums, 4);
        Assert.assertFalse(res);
    }

    @Test
    public void test2() {
        int[][] nums = new int[][]{
                {2,1,5},
                {3,3,7}
        };
        boolean res = pool.carPooling(nums, 5);
        Assert.assertTrue(res);
    }
}

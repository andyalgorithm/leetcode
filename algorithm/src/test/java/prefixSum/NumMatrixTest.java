package prefixSum;

import org.junit.Assert;
import org.junit.Test;

public class NumMatrixTest {

    int[][] nums = new int[][] {
            {3,0,1,4,2},
            {5,6,3,2,1},
            {1,2,0,1,5},
            {4,1,0,1,7},
            {1,0,3,0,5}
    };
    private NumMatrix matrix = new NumMatrix(nums);

    @Test
    public void test1() {
        int res = matrix.sumRegion(2,1,4,3);
        Assert.assertEquals(8, res);
    }

    @Test
    public void test2() {
        int res = matrix.sumRegion(1,1,2,2);
        Assert.assertEquals(11, res);
    }

    @Test
    public void test3() {
        int res = matrix.sumRegion(1,2,2,4);
        Assert.assertEquals(12, res);
    }
}

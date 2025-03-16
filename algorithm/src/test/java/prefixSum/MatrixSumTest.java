package prefixSum;

import org.junit.Assert;
import org.junit.Test;

public class MatrixSumTest {

    private MatrixSum sum = new MatrixSum();

    @Test
    public void test1() {
        int[][] nums = new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] res = sum.matrixSum(nums, 1);
        int[][] expected = new int[][] {
                {12,21,16},
                {27,45,33},
                {24,39,28}
        };

        Assert.assertArrayEquals(expected, res);
    }
}

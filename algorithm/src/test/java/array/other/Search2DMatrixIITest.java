package array.other;

import org.junit.Test;

public class Search2DMatrixIITest {

    Search2DMatrixII solver = new Search2DMatrixII();

    @Test
    public void testOne() {
        int[][] nums = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        int target = 5;

        boolean res = solver.search2DMatrixII(nums, target);
        System.out.println(res);
        // true
    }

    @Test
    public void testTwo() {
        int[][] nums = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        int target = 20;

        boolean res = solver.search2DMatrixII(nums, target);
        System.out.println(res);
        // false
    }

}

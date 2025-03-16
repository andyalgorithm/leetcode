package DP;

import org.junit.Test;

public class MinPathSumTest {

    MinPathSum solver = new MinPathSum();

    @Test
    public void testOne(){
        int[][] grid = new int[][]{
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };

        int res = solver.minPathSum(grid);
        System.out.println(res);
        // 7
    }

    @Test
    public void testTwo(){
        int[][] grid = new int[][]{
                {1,2,3},
                {4,5,6}
        };

        int res = solver.minPathSum(grid);
        System.out.println(res);
        // 12
    }


}

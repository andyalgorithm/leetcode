package DP;

import org.junit.Test;

public class MinFallingPathSum2Test {
    MinFallingPathSum2 solver = new MinFallingPathSum2();

    @Test
    public void testOne() {
        int[][] grid = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int res = solver.minFallingPathSum(grid);
        System.out.println(res);
        // 13
    }

    @Test
    public void testTwo() {
        int[][] grid = {{7}};
        int res = solver.minFallingPathSum(grid);
        System.out.println(res);
        // 7
    }

    @Test
    public void testThree() {
        int[][] grid = {
                {-73,61,43,-48,-36},
                {3,30,27,57,10},
                {96,-76,84,59,-15},
                {5,-49,76,31,-7},
                {97,91,61,-46,67}
        };
        int res = solver.minFallingPathSum(grid);
        System.out.println(res);
        // -192

    }
}

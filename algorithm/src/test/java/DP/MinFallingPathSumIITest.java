package DP;

import org.junit.Test;

public class MinFallingPathSumIITest {
    MinFallingPathSumII solver = new MinFallingPathSumII();

    @Test
    public void testOne() {
        int[][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
        int res = solver.minFallingPathSum(matrix);
        System.out.println(res);
        // 13
    }

    @Test
    public void testTwo() {
        int[][] matrix = {{-19,57},{-40,-5}};
        int res = solver.minFallingPathSum(matrix);
        System.out.println(res);
        // -59
    }

    @Test
    public void testThree() {
        int[][] matrix = {{-48}};
        int res = solver.minFallingPathSum(matrix);
        System.out.println(res);
        // -48
    }

    @Test
    public void testFour() {
        int[][] matrix = {{100,-42,-46,-41},{31,97,10,-10},{-58,-51,82,89},{51,81,69,-51}};
        int res = solver.minFallingPathSum(matrix);
        System.out.println(res);
        // -48
    }
}

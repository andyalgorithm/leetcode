package DP;

import org.junit.Test;

public class UniquePathsWithObstaclesTest {
    UniquePathsWithObstacles solver = new UniquePathsWithObstacles();

    @Test
    public void testOne(){
        int[][] obstacleGrid = new int[][]{
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };
        int res = solver.uniquePathsWithObstacles(obstacleGrid);
        System.out.println(res);
        // 2
    }

    @Test
    public void testTwo(){
        int[][] obstacleGrid = new int[][]{
                {0,1},
                {0,0},
        };
        int res = solver.uniquePathsWithObstacles(obstacleGrid);
        System.out.println(res);
        // 1
    }

    @Test
    public void testThree(){
        int[][] obstacleGrid = new int[][]{
                {1,0},
        };
        int res = solver.uniquePathsWithObstacles(obstacleGrid);
        System.out.println(res);
        // 0
    }
}

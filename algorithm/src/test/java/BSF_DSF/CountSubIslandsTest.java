package BSF_DSF;

import BFS_DFS.CountSubIslands;
import org.junit.Test;

public class CountSubIslandsTest {
    
    CountSubIslands solver = new CountSubIslands();
    
    @Test
    public void testOne() {
        int[][] grid1 = new int[][]{
                {1,1,1,0,0},
                {0,1,1,1,1},
                {0,0,0,0,0},
                {1,0,0,0,0},
                {1,1,0,1,1}
        };
        int[][] grid2 = new int[][]{
                {1,1,1,0,0},
                {0,0,1,1,1},
                {0,1,0,0,0},
                {1,0,1,1,0},
                {0,1,0,1,0}
        };

        int res = solver.countSubIsland(grid1, grid2);
        System.out.println(res);
        // 3
    }

    @Test
    public void testTwo() {
        int[][] grid1 = new int[][]{
                {1,0,1,0,1},
                {1,1,1,1,1},
                {0,0,0,0,0},
                {1,1,1,1,1},
                {1,0,1,0,1}
        };
        int[][] grid2 = new int[][]{
                {0,0,0,0,0},
                {1,1,1,1,1},
                {0,1,0,1,0},
                {0,1,0,1,0},
                {1,0,0,0,1}
        };

        int res = solver.countSubIsland(grid1, grid2);
        System.out.println(res);
        // 2
    }
}

package BSF_DSF;

import BFS_DFS.MaxAreaIsland;
import org.junit.Test;

public class MaxAreaIslandTest {

    MaxAreaIsland solver = new MaxAreaIsland();

    @Test
    public void testOne() {
        int[][] grid = {
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };

        int res = solver.maxAreaIsland(grid);
        System.out.println(res);
        // 6
    }

    @Test
    public void testTwo() {
        int[][] grid = {
                {0,0,0,0,0,0,0,},
        };

        int res = solver.maxAreaIsland(grid);
        System.out.println(res);
        // 0
    }
}

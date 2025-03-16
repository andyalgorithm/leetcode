package BSF_DSF;

import BFS_DFS.NumberClosedIslands;
import BFS_DFS.NumberEnclaves;
import org.junit.Test;

public class NumberClosedIslandsTest {

    NumberClosedIslands solver = new NumberClosedIslands();

    @Test
    public void testOne() {
        int[][] grid = new int[][] {
                {1,1,1,1,1,1,1,0},
                {1,0,0,0,0,1,1,0},
                {1,0,1,0,1,1,1,0},
                {1,0,0,0,0,1,0,1},
                {1,1,1,1,1,1,1,0}
        };

        int res = solver.numberClosedIslands(grid);
        System.out.println(res);
        // 2
    }
}

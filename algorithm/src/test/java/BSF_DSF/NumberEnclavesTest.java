package BSF_DSF;

import BFS_DFS.NumberEnclaves;
import org.junit.Test;

public class NumberEnclavesTest {

    NumberEnclaves solver = new NumberEnclaves();

    @Test
    public void testOne() {
        int[][] grid = new int[][] {
                {0,0,0,0},
                {1,0,1,0},
                {0,1,1,0},
                {0,0,0,0}
        };
        int res = solver.numberEnclaves(grid);
        System.out.println(res);
        // 3
    }
}

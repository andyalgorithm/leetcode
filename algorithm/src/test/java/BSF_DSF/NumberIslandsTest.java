package BSF_DSF;

import BFS_DFS.NumberIslands;
import org.junit.Test;

public class NumberIslandsTest {
    NumberIslands solver = new NumberIslands();

    @Test
    public void testOne() {
        char[][] grid = {
             {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
        };

        int res = solver.numberIslands(grid);
        System.out.println(res);
        // 1
    }

    @Test
    public void testTwo() {
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };

        int res = solver.numberIslands(grid);
        System.out.println(res);
        // 3

    }
}

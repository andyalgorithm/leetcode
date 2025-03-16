package BSF_DSF;

import BFS_DFS.NumberDistinctIslands;
import BFS_DFS.NumberIslands;
import org.junit.Test;

public class NumberDistinctIslandsTest {

    NumberDistinctIslands solver = new NumberDistinctIslands();

    @Test
    public void testOne() {
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','0','1','1'},
                {'0','0','0','1','1'},
        };

        int res = solver.numberDistinctIslands(grid);
        System.out.println(res);
        // 1
    }

    @Test
    public void testTwo() {
        char[][] grid = {
                {'1','1','0','1','1'},
                {'1','0','0','0','0'},
                {'0','0','0','0','1'},
                {'1','1','0','1','1'},
        };

        int res = solver.numberDistinctIslands(grid);
        System.out.println(res);
        // 3
    }
}

package BSF_DSF;

import BFS_DFS.SurroundedRegions;
import org.junit.Test;

public class SurroundedRegionsTest {

    SurroundedRegions solver = new SurroundedRegions();

    @Test
    public void testOne() {
        char[][] board = new char[][]{
                {'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}
        };

        solver.surroundedRegions(board);
        for(char[] t: board){
            System.out.println(t);
            /**
             * XXXX
             * XXXX
             * XXXX
             * XOXX
             */
        }

    }
}

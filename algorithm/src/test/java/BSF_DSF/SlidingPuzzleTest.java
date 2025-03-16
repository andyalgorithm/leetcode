package BSF_DSF;

import BFS_DFS.SlidingPuzzle;
import org.junit.Test;

public class SlidingPuzzleTest {
    SlidingPuzzle slover = new SlidingPuzzle();

    @Test
    public void testOne() {
        int[][] nums = new int[][] {
                {1,2,3},
                {4,0,5}
        };
        int res = slover.slidingPuzzle(nums);
        System.out.println(res);
        // 1
    }

    @Test
    public void testTwo() {
        int[][] nums = new int[][] {
                {1,2,3},
                {5,4,0}
        };
        int res = slover.slidingPuzzle(nums);
        System.out.println(res);
        // -1
    }

    @Test
    public void testThree() {
        int[][] nums = new int[][] {
                {4,1,2},
                {5,0,3}
        };
        int res = slover.slidingPuzzle(nums);
        System.out.println(res);
        // 5
    }
}

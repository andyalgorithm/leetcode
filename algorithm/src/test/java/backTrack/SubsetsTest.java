package backTrack;

import org.junit.Test;

import java.util.ArrayList;

public class SubsetsTest {

    Subsets solver = new Subsets();

    @Test
    public void testOne() {
        int[] nums = new int[]{1, 2, 3};
        ArrayList<ArrayList<Integer>> res = solver.subsets(nums);
        for(ArrayList<Integer> t: res) {
            System.out.println(t);
        }
    }
    /**
     * []
     * [1]
     * [1, 2]
     * [1, 2, 3]
     * [1, 3]
     * [2]
     * [2, 3]
     * [3]
     */
}

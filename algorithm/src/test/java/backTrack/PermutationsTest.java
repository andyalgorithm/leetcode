package backTrack;


import org.junit.Test;

import java.util.ArrayList;

public class PermutationsTest {

    Permutations solver = new Permutations();

    @Test
    public void testOne() {
        int[] nums = new int[]{1,2,3};
        ArrayList<ArrayList<Integer>> res = solver.permutations(nums);
        for(ArrayList<Integer> t: res) {
            System.out.println(t);
        }
    }
    /**
     * [1, 2, 3]
     * [1, 3, 2]
     * [2, 1, 3]
     * [2, 3, 1]
     * [3, 1, 2]
     * [3, 2, 1]
     */
}

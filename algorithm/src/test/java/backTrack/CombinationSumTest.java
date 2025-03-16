package backTrack;

import org.junit.Test;

import java.util.ArrayList;

public class CombinationSumTest {

    CombinationSum solver = new CombinationSum();

    @Test
    public void testOne(){
        int[] candidates = new int[]{2,3,6,7};
        int target = 7;

        ArrayList<ArrayList<Integer>> res = solver.combinationSum(candidates, target);

        for(ArrayList<Integer> t: res) {
            System.out.println(t);
        }
    }
    /**
     * [2, 2, 3]
     * [7]
     */


    @Test
    public void testTwo(){
        int[] candidates = new int[]{2,3,5};
        int target = 8;

        ArrayList<ArrayList<Integer>> res = solver.combinationSum(candidates, target);

        for(ArrayList<Integer> t: res) {
            System.out.println(t);
        }
    }
    /**
     * [2, 2, 2, 2]
     * [2, 3, 3]
     * [3, 5]
     */

}

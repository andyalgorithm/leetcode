import org.junit.Test;

import java.util.List;

public class CombinationSum2Test {
    CombinationSum2 solver = new CombinationSum2();

    @Test
    public void test1(){
        int[] nums = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> res = solver.combinationSum2(nums, target);
        for(List<Integer> t: res){
            System.out.println(t);
        }
        /**
         * [1, 1, 6]
         * [1, 2, 5]
         * [1, 7]
         * [2, 6]
         */
    }

    @Test
    public void test2(){
        int[] nums = {2,5,2,1,2};
        int target = 5;
        List<List<Integer>> res = solver.combinationSum2(nums, target);
        for(List<Integer> t: res){
            System.out.println(t);
        }
        /**
         * [1, 2, 2]
         * [5]
         */
    }

}

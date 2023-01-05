import org.junit.Test;

import java.util.List;

public class CombinationSumTest {
    CombinationSum solver = new CombinationSum();

    @Test
    public void test1(){
        int[] nums = {2,3,6,7};
        int target = 7;
        List<List<Integer>> res = solver.combinationSum(nums, target);
        for(List<Integer> t: res){
            System.out.println(t);
        }
        /**
         * [2, 2, 3]
         * [7]
         */
    }

    @Test
    public void test2(){
        int[] nums = {2,3,5};
        int target = 8;
        List<List<Integer>> res = solver.combinationSum(nums, target);
        for(List<Integer> t: res){
            System.out.println(t);
        }
        /**
         * [2, 2, 2, 2]
         * [2, 3, 3]
         * [3, 5]
         */
    }

    @Test
    public void test3(){
        int[] nums = {2};
        int target = 1;
        List<List<Integer>> res = solver.combinationSum(nums, target);
        for(List<Integer> t: res){
            System.out.println(t);
        }
        // []
    }
}

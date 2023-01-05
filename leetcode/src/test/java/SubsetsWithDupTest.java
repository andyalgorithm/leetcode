import org.junit.Test;

import java.util.List;

public class SubsetsWithDupTest {
    SubsetsWithDup solver = new SubsetsWithDup();

    @Test
    public void test1(){
        int[] nums = {1,2,2};
        List<List<Integer>> res = solver.subsetsWithDup(nums);
        for(List<Integer> t: res){
            System.out.println(t);
        }
        /**
         * []
         * [1]
         * [1, 2]
         * [1, 2, 2]
         * [2]
         * [2, 2]
         */
    }

    @Test
    public void test2(){
        int[] nums = {0};
        List<List<Integer>> res = solver.subsetsWithDup(nums);
        for(List<Integer> t: res){
            System.out.println(t);
        }
        /**
         * []
         * [0]
         */
    }
}

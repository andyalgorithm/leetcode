import org.junit.Test;

import java.util.List;

public class SubsetsTest {
    Subsets solver = new Subsets();

    @Test
    public void test1(){
        int[] nums = {1,2,3};
        List<List<Integer>> res = solver.subsets(nums);
        for(List<Integer> t: res){
            System.out.println(t);
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

    @Test
    public void test2(){
        int[] nums = {0};
        List<List<Integer>> res = solver.subsets(nums);
        for(List<Integer> t: res){
            System.out.println(t);
        }
        /**
         * []
         * [0]
         */
    }
}

import org.junit.Test;

import java.util.List;

public class FourSumTest {
    FourSum solver = new FourSum();

    @Test
    public void test1(){
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> res = solver.fourSum(nums, target);
        for(List<Integer> t: res){
            System.out.println(t);
        }
    }
}

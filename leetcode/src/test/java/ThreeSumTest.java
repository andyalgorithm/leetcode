import com.sun.javaws.IconUtil;
import org.junit.Test;

import java.util.List;

public class ThreeSumTest {

    ThreeSum solver = new ThreeSum();

    @Test
    public void test1() {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = solver.threeSum(nums);
        for(List<Integer> t: res){
            System.out.println(t);
        }
        //
    }

    @Test
    public void test2() {
        int[] nums = {0,1,1};
        List<List<Integer>> res = solver.threeSum(nums);
        for(List<Integer> t: res){
            System.out.println(t);
        }
    }

    @Test
    public void test3() {
        int[] nums = {0,0,0};
        List<List<Integer>> res = solver.threeSum(nums);
        for(List<Integer> t: res){
            System.out.println(t);
        }
    }
}

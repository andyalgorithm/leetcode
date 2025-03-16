import org.junit.Test;

import java.util.List;

public class ThreeSumTest {

    ThreeSum solver = new ThreeSum();

    @Test
    public void testOne() {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = solver.threeSum(nums);
        for(List<Integer> t: res) {
            System.out.println(t);
            /**
             * [-1, 2, -1]
             * [0, 1, -1]
             */
        }
    }


    @Test
    public void testTwo() {
        int[] nums = {0,1,1};
        List<List<Integer>> res = solver.threeSum(nums);
        for(List<Integer> t: res) {
            System.out.println(t);
        }
    }


    @Test
    public void testThree() {
        int[] nums = {0,0,0};
        List<List<Integer>> res = solver.threeSum(nums);
        for(List<Integer> t: res) {
            System.out.println(t);
            /**
             * [0,0,0]
             */
        }
    }
}

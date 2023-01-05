import org.junit.Test;

import java.util.Arrays;

public class SearchRangeTest {

    SearchRange solver = new SearchRange();

    @Test
    public void test1(){
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] res = solver.searchRange(nums, target);
        System.out.println(Arrays.toString(res));
        // [3, 4]
    }

    @Test
    public void test2(){
        int[] nums = {5,7,7,8,8,10};
        int target = 6;
        int[] res = solver.searchRange(nums, target);
        System.out.println(Arrays.toString(res));
        // [-1, -1]
    }

    @Test
    public void test3(){
        int[] nums = {};
        int target = 0;
        int[] res = solver.searchRange(nums, target);
        System.out.println(Arrays.toString(res));
        // [-1, -1]
    }

    @Test
    public void test4(){
        int[] nums = {1};
        int target = 1;
        int[] res = solver.searchRange(nums, target);
        System.out.println(Arrays.toString(res));
        // [0, 0]
    }
}

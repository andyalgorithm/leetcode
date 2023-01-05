import org.junit.Test;

import java.util.Arrays;

public class SortColorsTest {
    SortColors solver = new SortColors();

    @Test
    public void test1(){
        int[] nums = {2,0,2,1,1,0};
        solver.sortColors(nums);
        System.out.println(Arrays.toString(nums));
        // [0, 0, 1, 1, 2, 2]
    }

//    @Test
    public void test2(){
        int[] nums = {2,0,1};
        solver.sortColors(nums);
        System.out.println(Arrays.toString(nums));
        // [0, 0, 1, 1, 2, 2]
    }
}

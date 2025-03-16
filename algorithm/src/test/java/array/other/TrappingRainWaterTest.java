package array.other;

import org.junit.Test;

public class TrappingRainWaterTest {

    TrappingRainWater solver = new TrappingRainWater();

    @Test
    public void testOne() {
        int[] nums = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
        int res = solver.trappingRainWater(nums);
        System.out.println(res);
        // 6
    }

    @Test
    public void testTwo() {
        int[] nums = new int[] {4,2,0,3,2,5};
        int res = solver.trappingRainWater(nums);
        System.out.println(res);
        // 9
    }
}

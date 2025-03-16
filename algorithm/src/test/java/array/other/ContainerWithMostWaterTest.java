package array.other;

import org.junit.Test;

public class ContainerWithMostWaterTest {

    ContainerWithMostWater solver = new ContainerWithMostWater();

    @Test
    public void  testOne() {
        int[] nums = new int[] {1,8,6,2,5,4,8,3,7};
        int res = solver.containerWithMOstWater(nums);
        System.out.println(res);
        // 49
    }
}

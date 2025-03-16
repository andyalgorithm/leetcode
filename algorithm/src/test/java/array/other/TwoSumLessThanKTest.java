package array.other;

import org.junit.Test;

public class TwoSumLessThanKTest {

    TwoSumLessThanK solver = new TwoSumLessThanK();

    @Test
    public void testOne() {
        int[] nums = new int[] {34,23,1,24,75,33,54,8};
        int k = 60;
        int res = solver.twoSumLessThanK(nums, k);
        System.out.println(res);
        // 58
    }

    @Test
    public void testTwo() {
        int[] nums = new int[] {10,20,30};
        int k = 15;
        int res = solver.twoSumLessThanK(nums, k);
        System.out.println(res);
        // -1
    }
}

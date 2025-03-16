package array.other;

import org.junit.Test;

import java.util.Arrays;

public class AdvantageShuffleTest {

    AdvantageShuffle solver = new AdvantageShuffle();

    @Test
    public void testOne(){
        int[] nums1 = {2,7,11,15};
        int[] nums2 = {1,10,4,11};
        int[] res = solver.advantageShuffle(nums1, nums2);
        System.out.println(Arrays.toString(res));
        // [2, 11, 7, 15]
    }

    @Test
    public void testTwo(){
        int[] nums1 = {12,24,8,32};
        int[] nums2 = {13,25,32,11};
        int[] res = solver.advantageShuffle(nums1, nums2);
        System.out.println(Arrays.toString(res));
        // [24, 32, 8, 12]
    }
}

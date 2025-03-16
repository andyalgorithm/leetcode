package DP;

import org.junit.Test;

public class DisjointLinesTest {

    DisjointLines solver = new DisjointLines();

    @Test
    public void testOne() {
        int[] nums1 = new int[]{1,4,2};
        int[] nums2 = new int[]{1,2,4};
        int res = solver.maxUncrossedLines(nums1, nums2);
        System.out.println(res);
        // 2
    }

    @Test
    public void testTwo() {
        int[] nums1 = new int[]{2,5,1,2,5};
        int[] nums2 = new int[]{10,5,2,1,5,2};
        int res = solver.maxUncrossedLines(nums1, nums2);
        System.out.println(res);
        // 3
    }

    @Test
    public void testThree() {
        int[] nums1 = new int[]{1,3,7,1,7,5};
        int[] nums2 = new int[]{1,9,2,5,1};
        int res = solver.maxUncrossedLines(nums1, nums2);
        System.out.println(res);
        // 2
    }
}

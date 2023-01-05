import org.junit.Test;

public class FindMedianSortedArraysIIITest {
    FindMedianSortedArraysIII solver = new FindMedianSortedArraysIII();

    @Test
    public void test1() {
        int[] nums1 = new int[] {1,3};
        int[] nums2 = new int[] {2};
        double res = solver.findMedianSortedArrays(nums1, nums2);
        System.out.println(res);
        // 2.0
    }

    @Test
    public void test2() {
        int[] nums1 = new int[] {1,2};
        int[] nums2 = new int[] {3,4};
        double res = solver.findMedianSortedArrays(nums1, nums2);
        System.out.println(res);
        // 2.5
    }


    @Test
    public void test3() {
        int[] nums1 = new int[] {2};
        int[] nums2 = new int[] {};
        double res = solver.findMedianSortedArrays(nums1, nums2);
        System.out.println(res);
        // 2.0
    }

    @Test
    public void test4() {
        int[] nums1 = new int[] {2,2,4,4};
        int[] nums2 = new int[] {2,2,4,4};
        double res = solver.findMedianSortedArrays(nums1, nums2);
        System.out.println(res);
        // 3.0
    }

    @Test
    public void test5() {
        int[] nums1 = new int[] {1,2};
        int[] nums2 = new int[] {-1,3};
        double res = solver.findMedianSortedArrays(nums1, nums2);
        System.out.println(res);
        // 1.5
    }
}

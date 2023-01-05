import org.junit.Test;

public class FindMedianSortedArraysTest {
    FindMedianSortedArrays solver = new FindMedianSortedArrays();

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
}

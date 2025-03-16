package array.other;

import org.junit.Test;

import java.util.Arrays;

public class RemoveDuplicateSortedArrayTest {

    RemoveDuplicateSortedArray solver = new RemoveDuplicateSortedArray();

    @Test
    public void testOne() {
        int[] nums = new int[]{0,0,1,2,2,3,3,};
        solver.removeDuplicateSortedArray(nums);
        System.out.println(Arrays.toString(nums));
        // [0, 1, 2, 3, 0, 0, 0]
    }
}

package array.other;

import org.junit.Test;

import java.util.Arrays;

public class SquaresSortedArrayTest {

    SquaresSortedArray solver = new SquaresSortedArray();

    @Test
    public void testOne() {
        int[] nums = new int[]{-4, -1, 0, 3, 10};
        int[] res = solver.squaresSortedArray(nums);
        System.out.println(Arrays.toString(res));
        // [0, 1, 9, 16, 100]
    }
}

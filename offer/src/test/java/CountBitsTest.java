import org.junit.Test;

import java.util.Arrays;

public class CountBitsTest {
    CountBits solver = new CountBits();

    @Test
    public void testOne() {
        int[] res = solver.countBits(2);
        System.out.println(Arrays.toString(res));
        // [0, 1, 1]
    }

    @Test
    public void testTwo() {
        int[] res = solver.countBits(5);
        System.out.println(Arrays.toString(res));
        // [0, 1, 1, 2, 1, 2]
    }
}

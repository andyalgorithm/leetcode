import org.junit.Test;

public class FindMaxLengthTest {
    FindMaxLength solver = new FindMaxLength();

    @Test
    public void testOne() {
        int[] nums = {0, 1};
        int res = solver.findMaxLength(nums);
        System.out.println(res);
        // 2
    }

    @Test
    public void testTwo() {
        int[] nums = {0, 1, 0};
        int res = solver.findMaxLength(nums);
        System.out.println(res);
        // 2
    }

    @Test
    public void testThree() {
        int[] nums = {0, 1, 0, 1};
        int res = solver.findMaxLength(nums);
        System.out.println(res);
        // 2
    }


}

import org.junit.Test;

public class MinSubArrayLengthTest {

    MinSubArrayLength solver = new MinSubArrayLength();

    @Test
    public void testOne() {
        int target = 7;
        int[] nums = new int[] {2,3,1,2,4,3};
        int res = solver.minSubArrayLen(target, nums);
        System.out.println(res);
        // 2
    }

    @Test
    public void testTwo() {
        int target = 4;
        int[] nums = new int[] {1, 4, 4};
        int res = solver.minSubArrayLen(target, nums);
        System.out.println(res);
        // 1
    }

    @Test
    public void testThree() {
        int target = 11;
        int[] nums = new int[] {1,1,1,1,1,1,1,1};
        int res = solver.minSubArrayLen(target, nums);
        System.out.println(res);
        // 0
    }

    @Test
    public void testFour() {
        int target = 213;
        int[] nums = new int[] {12,28,83,4,25,26,25,2,25,25,25,12};
        int res = solver.minSubArrayLen(target, nums);
        System.out.println(res);
        // 0
    }
}

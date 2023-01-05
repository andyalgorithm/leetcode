import org.junit.Test;

public class JumpTest {
    Jump solver = new Jump();

    @Test
    public void test1() {
        int[] nums = new int[] {2,3,1,1,4};
        int res = solver.jump(nums);
        System.out.println(res);
        // 2
    }

    @Test
    public void test2() {
        int[] nums = new int[] {2,3,0,1,4};
        int res = solver.jump(nums);
        System.out.println(res);
        // 2
    }

    @Test
    public void test3() {
        int[] nums = new int[] {2,1};
        int res = solver.jump(nums);
        System.out.println(res);
        // 2
    }
}

import org.junit.Test;

public class DeleteAndEarnTest {

    DeleteAndEarn solver = new DeleteAndEarn();

//    @Test
    public void test1() {
        int[] nums = new int[]{3,4,2};
        int res = solver.deleteAndEarn(nums);
        System.out.println(res);
        // 6
    }

    @Test
    public void test2() {
        int[] nums = new int[]{2,2,3,3,3,4};
        int res = solver.deleteAndEarn(nums);
        System.out.println(res);
        // 9
    }

    @Test
    public void test3() {
        int[] nums = new int[]{1,1,1,2,4,5,5,5,6};
        int res = solver.deleteAndEarn(nums);
        System.out.println(res);
        // 18
    }

}

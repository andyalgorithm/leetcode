import org.junit.Test;

public class PivotIndexIIITest {

    PivotIndexIII solver = new PivotIndexIII();

    @Test
    public void test1() {
        int[] nums = {1,7,3,6,5,6};
        int res = solver.pivotIndex(nums);
        System.out.println(res);
        // 3
    }

    @Test
    public void test2() {
        int[] nums = {1,2,3};
        int res = solver.pivotIndex(nums);
        System.out.println(res);
        // -1
    }

    @Test
    public void test3() {
        int[] nums = {2,1,-1};
        int res = solver.pivotIndex(nums);
        System.out.println(res);
        // 0
    }
}

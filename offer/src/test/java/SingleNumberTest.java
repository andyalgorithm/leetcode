import org.junit.Test;

public class SingleNumberTest {

    SingleNumber solver = new SingleNumber();

    @Test
    public void testOne() {
        int[] nums = {2,2,3,2};
        int res = solver.singleNumber(nums);
        System.out.println(res);
        // 3
    }

    @Test
    public void testTwo() {
        int[] nums = {0,1,0,1,0,1,100};
        int res = solver.singleNumber(nums);
        System.out.println(res);
        // 100
    }
}

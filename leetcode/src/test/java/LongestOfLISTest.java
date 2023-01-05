import org.junit.Test;

public class LongestOfLISTest {
    LengthOfLIS solver = new LengthOfLIS();

    @Test
    public void test1(){
        int[] nums = {10,9,2,5,3,7,101,18};
        int res = solver.lengthOfLIS(nums);
        System.out.println(res);
    }

    @Test
    public void test2(){
        int[] nums = {1,3,6,7,9,4,10,5,6};
        int res = solver.lengthOfLIS(nums);
        System.out.println(res);
        // 6
    }
}

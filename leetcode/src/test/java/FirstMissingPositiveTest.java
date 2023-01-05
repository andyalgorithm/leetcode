import org.junit.Test;

public class FirstMissingPositiveTest {
    FirstMissingPositive solver = new FirstMissingPositive();

    @Test
    public void test1(){
        int[] nums = {1,2,0};
        int res = solver.firstMissingPositive(nums);
        System.out.println(res);
        // 3
    }

    @Test
    public void test2(){
        int[] nums = {3,4,-1,1};
        int res = solver.firstMissingPositive(nums);
        System.out.println(res);
        // 2
    }

    @Test
    public void test3(){
        int[] nums = {7,8,9,11,12};
        int res = solver.firstMissingPositive(nums);
        System.out.println(res);
        // 1
    }
}

import org.junit.Test;

public class FindMinTest {
    FindMin solver = new FindMin();

    @Test
    public void test1(){
        int[] nums = {1,3,5};
        int res = solver.findMin(nums);
        System.out.println(res);
        // 10
    }

    @Test
    public void test2(){
        int[] nums = {10,1,10,10,10};
        int res = solver.findMin(nums);
        System.out.println(res);
    }
}

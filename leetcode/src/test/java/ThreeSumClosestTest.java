import org.junit.Test;

public class ThreeSumClosestTest {
    ThreeSumClosest solver = new ThreeSumClosest();

    @Test
    public void test1(){
        int[] nums = {-1,2,1,-4};
        int target = 1;
        int res = solver.threeSumClosest(nums, target);
        System.out.println(res);
        // 2
    }

    @Test
    public void test2(){
        int[] nums = {0,0,0};
        int target = 1;
        int res = solver.threeSumClosest(nums, target);
        System.out.println(res);
        // 0
    }

}

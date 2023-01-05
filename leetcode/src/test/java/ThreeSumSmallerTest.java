import org.junit.Test;

public class ThreeSumSmallerTest {
    ThreeSumSmaller solver = new ThreeSumSmaller();

    @Test
    public void test1(){
        int[] nums = {-2,0,1,3};
        int target = 2;
        int res = solver.threeSumSmaller(nums, target);
        System.out.println(res);
        // 2
    }

    @Test
    public void test2(){
        int[] nums = {};
        int target = 0;
        int res = solver.threeSumSmaller(nums, target);
        System.out.println(res);
        // 0
    }

    @Test
    public void test3(){
        int[] nums = {0};
        int target = 0;
        int res = solver.threeSumSmaller(nums, target);
        System.out.println(res);
        // 0
    }

    @Test
    public void test4(){
        int[] nums = {3,1,0,-2};
        int target = 4;
        int res = solver.threeSumSmaller(nums, target);
        System.out.println(res);
        // 3
    }
}

import org.junit.Test;

public class FindDuplicateTest {

    FindDuplicate solver = new FindDuplicate();

    @Test
    public void test1(){
        int[] nums = {1,3,4,2,2};
        int res = solver.findDuplicate(nums);
        System.out.println(res);
        // 2
    }

    @Test
    public void test2(){
        int[] nums = {3,1,3,4,2};
        int res = solver.findDuplicate(nums);
        System.out.println(res);
        // 3
    }
}

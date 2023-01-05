import org.junit.Test;

public class SearchTest {

    Search solver = new Search();

    @Test
    public void test1(){
        int[] nums = {4,5,6,7,0,1,2};
        int traget = 0;
        int res = solver.search(nums, traget);
        System.out.println(res);
        // 4
    }

    @Test
    public void test2(){
        int[] nums = {4,5,6,7,0,1,2};
        int traget = 3;
        int res = solver.search(nums, traget);
        System.out.println(res);
        // -1
    }

    @Test
    public void test3(){
        int[] nums = {1};
        int traget = 0;
        int res = solver.search(nums, traget);
        System.out.println(res);
        // -1
    }
}

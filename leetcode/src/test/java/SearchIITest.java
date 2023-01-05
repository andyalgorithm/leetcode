import org.junit.Test;

public class SearchIITest {
    SearchII solver = new SearchII();

    @Test
    public void test1(){
        int[] nums = {4,5,6,7,0,1,2};
        int target = 1;
        boolean res = solver.search(nums, target);
        System.out.println(res);
        // true
    }
}

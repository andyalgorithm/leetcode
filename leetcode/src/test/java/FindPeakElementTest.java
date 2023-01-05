import org.junit.Test;

public class FindPeakElementTest {
    FindPeakElement solver = new FindPeakElement();

    @Test
    public void test1(){
        int[] nums = {1,2,3,1};
        int res = solver.findPeakElement(nums);
        System.out.println(res);
    }
}

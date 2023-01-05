import org.junit.Test;

public class MaxAreaTest {
    MaxArea solver = new MaxArea();

    @Test
    public void test1(){
        int[] height = {1,8,6,2,5,4,8,3,7};
        int res = solver.maxArea(height);
        System.out.println(res);
    }
}

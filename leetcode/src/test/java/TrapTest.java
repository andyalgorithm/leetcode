import org.junit.Test;

public class TrapTest {
    Trap solver = new Trap();

    @Test
    public void test1(){
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int res = solver.trap(height);
        System.out.println(res);
        // 6
    }

    @Test
    public void test2(){
        int[] height = {4,2,0,3,2,5};
        int res = solver.trap(height);
        System.out.println(res);
        // 9
    }
}

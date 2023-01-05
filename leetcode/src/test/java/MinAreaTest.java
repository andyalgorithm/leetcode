import org.junit.Test;

public class MinAreaTest {
    MinArea solver = new MinArea();

    @Test
    public void test1(){
        char[][] image = {{'0','0','1','0'},{'0','1','1','0'},{'0','1','0','0'}};
        int x=0, y=2;
        int res= solver.minArea(image, x, y);
        System.out.println(res);
        // 6
    }

    @Test
    public void test2(){
        char[][] image = {{'1'}};
        int x=0, y=0;
        int res= solver.minArea(image, x, y);
        System.out.println(res);
        // 1
    }
}

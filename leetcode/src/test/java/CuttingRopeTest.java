import org.junit.Test;

public class CuttingRopeTest {
    CuttingRope solver = new CuttingRope();

//    @Test
    public void test1(){
        int n=2;
        int res = solver.cuttingRope(n);
        System.out.println(res);
        // 1
    }

    @Test
    public void test2(){
        int n=5;
        int res = solver.cuttingRope(n);
        System.out.println(res);
        // 6
    }

    @Test
    public void test3(){
        int n=10;
        int res = solver.cuttingRope(n);
        System.out.println(res);
        // 36
    }


}

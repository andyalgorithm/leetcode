import org.junit.Test;

public class CuttingRopeIITest {
    CuttingRopeII solver = new CuttingRopeII();

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

    @Test
    public void test4(){
        int n=120;
        int res = solver.cuttingRope(n);
        System.out.println(res);
        // 953271190
    }


}

import org.junit.Test;

public class MySqrtTest {
    MySqrt solver = new MySqrt();

//    @Test
    public void test1(){
        int x = 4;
        int res = solver.mySqrt(x);
        System.out.println(res);
        // 2
    }

//    @Test
    public void test2(){
        int x = 8;
        int res = solver.mySqrt(x);
        System.out.println(res);
        // 2
    }

//    @Test
    public void test3(){
        int x = 1;
        int res = solver.mySqrt(x);
        System.out.println(res);
        // 1
    }

    @Test
    public void test4(){
        int x = 2147395599;
        int res = solver.mySqrt(x);
        System.out.println(res);
        // 46339
    }

//    @Test
    public void test(){
        int n = 2147395599;
        System.out.println(n*n);
        // -837308191
    }
}

import org.junit.Test;

public class MyPowTest {
    MyPow solver = new MyPow();

    @Test
    public void test1(){
        double x = 2.0;
        int n = 10;
        double res = solver.myPow(x, n);
        System.out.println(res);
        // 1024.0
    }

    @Test
    public void test2(){
        double x = 2.0;
        int n = -3;
        double res = solver.myPow(x, n);
        System.out.println(res);
        // 0.125
    }

    @Test
    public void test3(){
        double x = 2.0;
        int n = -2147483648;
        double res = solver.myPow(x, n);
        System.out.println(res);
        // 0.0
    }

    @Test
    public void test4(){
        double x = -1.0;
        int n = -2147483648;
        double res = solver.myPow(x, n);
        System.out.println(res);
        // 1.0
    }

    @Test
    public void test(){

    }
}

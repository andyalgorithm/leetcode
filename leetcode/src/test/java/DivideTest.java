import org.junit.Test;

public class DivideTest {
    Divide solver = new Divide();

    @Test
    public void test1(){
        int dividend = 10;
        int divisor = 3;
        int res = solver.divide(dividend, divisor);
        System.out.println(res);
    }
}

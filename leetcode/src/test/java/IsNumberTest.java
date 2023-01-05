import org.junit.Test;

public class IsNumberTest {
    IsNumber solver = new IsNumber();

    @Test
    public void test1(){
        String s = "0";
        boolean res = solver.isNumber(s);
        System.out.println(res);
        // true
    }

    @Test
    public void test2(){
        String s = "-1E-16";
        boolean res = solver.isNumber(s);
        System.out.println(res);
        // true
    }
}

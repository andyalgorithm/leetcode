import org.junit.Test;

public class MyAtoiTest {
    MyAtoi solver = new MyAtoi();

    @Test
    public void test1(){
        String s = "42";
        int res = solver.myAtoi(s);
        System.out.println(res);
    }

    @Test
    public void test2(){
        String s = "   -42";
        int res = solver.myAtoi(s);
        System.out.println(res);
    }

    @Test
    public void test3(){
        String s = "4193 with words";
        int res = solver.myAtoi(s);
        System.out.println(res);
    }


}

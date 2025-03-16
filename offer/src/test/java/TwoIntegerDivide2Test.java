import org.junit.Test;

public class TwoIntegerDivide2Test {
    TwoIntegerDivide solver = new TwoIntegerDivide();

    @Test
    public void testOne() {
        int a=15, b=2;
        int res = solver.divide(a, b);
        System.out.println(res);
        // 7
    }

    @Test
    public void testTwo() {
        int a=7, b=-3;
        int res = solver.divide(a, b);
        System.out.println(res);
        // -2
    }

    @Test
    public void testThree() {
        int a=0, b=1;
        int res = solver.divide(a, b);
        System.out.println(res);
        // 0
    }

    @Test
    public void testFour() {
        int a=1, b=1;
        int res = solver.divide(a, b);
        System.out.println(res);
        // 1
    }

    @Test
    public void testFive() {
        int a=-2147483648, b=-1;
        int res = solver.divide(a, b);
        System.out.println(res);
        // 2147483647
    }

    @Test
    public void testSix() {
        int a=-2147483648, b=1;
        int res = solver.divide(a, b);
        System.out.println(res);
        // -2147483648
    }

}

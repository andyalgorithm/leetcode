import org.junit.Test;

public class MinWindowTest {
    MinWindow solver = new MinWindow();

    @Test
    public void test1() {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String res = solver.minWindow(s, t);
        System.out.println(res);
        // BANC
    }

    @Test
    public void test2() {
        String s = "a";
        String t = "a";
        String res = solver.minWindow(s, t);
        System.out.println(res);
        // a
    }

    @Test
    public void test3() {
        String s = "a";
        String t = "aa";
        String res = solver.minWindow(s, t);
        System.out.println(res);
        // ""
    }

    @Test
    public void test4() {
        String s = "abc";
        String t = "b";
        String res = solver.minWindow(s, t);
        System.out.println(res);
        // b
    }

    @Test
    public void test5() {
        String s = "a";
        String t = "b";
        String res = solver.minWindow(s, t);
        System.out.println(res);
        // ""
    }
}

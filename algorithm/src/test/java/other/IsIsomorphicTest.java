package other;

import org.junit.Test;

public class IsIsomorphicTest {
    IsIsomorphic solver = new IsIsomorphic();

    @Test
    public void testOne() {
        String s = "badc";
        String t = "babc";
        boolean res = solver.isIsomorphic(s, t);
        System.out.println(res);
        // false
    }

    @Test
    public void testTwo() {
        String s = "paper";
        String t = "title";
        boolean res = solver.isIsomorphic(s, t);
        System.out.println(res);
        // true
    }
}

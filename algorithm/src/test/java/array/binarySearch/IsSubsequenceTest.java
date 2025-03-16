package array.binarySearch;

import org.junit.Test;

public class IsSubsequenceTest {

    IsSubsequence solver = new IsSubsequence();

    @Test
    public void testOne() {
        String s = "abc";
        String t = "ahbgdc";
        boolean res = solver.isSubsequence(s, t);
        System.out.println(res);
        // true
    }

    @Test
    public void testTwo() {
        String s = "axc";
        String t = "ahbgdc";
        boolean res = solver.isSubsequence(s, t);
        System.out.println(res);
        // false
    }
}

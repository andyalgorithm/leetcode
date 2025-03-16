import org.junit.Test;

public class ValidPalindromeTest {

    ValidPalindrome solver = new ValidPalindrome();

    @Test
    public void test1() {
        String s = "aba";
        boolean res = solver.validPalindrome(s);
        System.out.println(res);
        // true
    }

    @Test
    public void test2() {
        String s = "abca";
        boolean res = solver.validPalindrome(s);
        System.out.println(res);
        // true
    }

    @Test
    public void test3() {
        String s = "abc";
        boolean res = solver.validPalindrome(s);
        System.out.println(res);
        // false
    }

    @Test
    public void test4() {
        String s = "cbbcc";
        boolean res = solver.validPalindrome(s);
        System.out.println(res);
        // true
    }

    @Test
    public void test5() {
        String s = "abc";
        boolean res = solver.validPalindrome(s);
        System.out.println(res);
        // false
    }
}

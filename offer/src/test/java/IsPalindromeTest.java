import org.junit.Test;

public class IsPalindromeTest {

    IsPalindrome solver = new IsPalindrome();

    @Test
    public void test1() {
        String s = "A man, a plan, a canal: Panama";
        boolean res = solver.isPalindrome(s);
        System.out.println(res);
        // true
    }

    @Test
    public void test2() {
        String s = "race a car";
        boolean res = solver.isPalindrome(s);
        System.out.println(res);
        // false
    }

    @Test
    public void test3() {
        String s = "0P";
        boolean res = solver.isPalindrome(s);
        System.out.println(res);
        // false
    }
}

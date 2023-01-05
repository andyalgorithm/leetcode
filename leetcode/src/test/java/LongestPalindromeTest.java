import org.junit.Test;

public class LongestPalindromeTest {
    LongestPalindrome solver = new LongestPalindrome();

//    @Test
//    public void test1() {
//        String s = "babad";
//        String res = solver.longestPalindrome(s);
//        System.out.println(res);
//        // bab
//    }
//
//    @Test
//    public void test2() {
//        String s = "abbd";
//        String res = solver.longestPalindrome(s);
//        System.out.println(res);
//        // bb
//    }
//
//
//    @Test
//    public void test3() {
//        String s = "a";
//        String res = solver.longestPalindrome(s);
//        System.out.println(res);
//        // a
//    }
//
//    @Test
//    public void test4() {
//        String s = "bb";
//        String res = solver.longestPalindrome(s);
//        System.out.println(res);
//        // bb
//    }

    @Test
    public void test5() {
        String s = "aacabdkacaa";
        String res = solver.longestPalindrome(s);
        System.out.println(res);
        // bb
    }
}

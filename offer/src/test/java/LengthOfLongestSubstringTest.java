import org.junit.Test;

public class LengthOfLongestSubstringTest {
    LengthOfLongestSubstring solver = new LengthOfLongestSubstring();

    @Test
    public void test1() {
        String s = "abcabcbb";
        int res = solver.lengthOfLongestSubstring(s);
        System.out.println(res);
        // 3
    }

    @Test
    public void test2() {
        String s = "bbbbb";
        int res = solver.lengthOfLongestSubstring(s);
        System.out.println(res);
        // 1
    }

    @Test
    public void test3() {
        String s = "pwwkew";
        int res = solver.lengthOfLongestSubstring(s);
        System.out.println(res);
        // 3
    }

    @Test
    public void test4() {
        String s = "tmmzuxt";
        int res = solver.lengthOfLongestSubstring(s);
        System.out.println(res);
        // 5
    }
}

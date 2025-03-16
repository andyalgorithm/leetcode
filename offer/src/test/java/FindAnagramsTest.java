import org.junit.Test;

import java.util.List;

public class FindAnagramsTest {

    FindAnagrams solver = new FindAnagrams();

    @Test
    public void test1() {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> res = solver.findAnagrams(s, p);
        System.out.println(res);
        // [0, 6]
    }

    @Test
    public void test2() {
        String s = "abab";
        String p = "ab";
        List<Integer> res = solver.findAnagrams(s, p);
        System.out.println(res);
        // [0, 1, 2]
    }
}

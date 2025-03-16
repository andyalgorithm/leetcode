import org.junit.Test;

public class CountSubstringsTest {
    CountSubstrings solver = new CountSubstrings();

    @Test
    public void test1() {
        String s = "abc";
        int res = solver.countSubstrings(s);
        System.out.println(res);
        // 3
    }

    @Test
    public void test2() {
        String s = "aaa";
        int res = solver.countSubstrings(s);
        System.out.println(res);
        // 6
    }


}

import org.junit.Test;

public class StrStrTest {
    StrStr solver = new StrStr();

    @Test
    public void test1(){
        String haystack = "sadbutsad", needle = "sad";
        int res = solver.strStr(haystack, needle);
        System.out.println(res);
        // 0
    }

    @Test
    public void test2(){
        String haystack = "leetcode", needle = "leeto";
        int res = solver.strStr(haystack, needle);
        System.out.println(res);
        // -1
    }
}

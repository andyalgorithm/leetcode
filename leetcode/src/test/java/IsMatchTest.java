import org.junit.Test;

public class IsMatchTest {
    IsMatch solver = new IsMatch();

    @Test
    public void test1(){
        String s = "aa";
        String p = "a";
        boolean res = solver.isMatch(s, p);
        System.out.println(res);
        // false
    }

    @Test
    public void test2(){
        String s = "aa";
        String p = "a*";
        boolean res = solver.isMatch(s, p);
        System.out.println(res);
        // true
    }

    @Test
    public void test3(){
        String s = "ab";
        String p = ".*";
        boolean res = solver.isMatch(s, p);
        System.out.println(res);
        // true
    }

    @Test
    public void test4(){
        String s = "aab";
        String p = "c*a*b";
        boolean res = solver.isMatch(s, p);
        System.out.println(res);
        // true
    }

    @Test
    public void test5(){
        String s = "mississippi";
        String p = "mis*is*p*.";
        boolean res = solver.isMatch(s, p);
        System.out.println(res);
        // false
    }
}

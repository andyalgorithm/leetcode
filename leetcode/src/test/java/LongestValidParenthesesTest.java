import org.junit.Test;

public class LongestValidParenthesesTest {
    LongestValidParentheses solver = new LongestValidParentheses();

    @Test
    public void test1(){
        String s = "(()";
        int res = solver.longestValidParentheses(s);
        System.out.println(res);
        // 2
    }

    @Test
    public void test2(){
        String s = ")()())";
        int res = solver.longestValidParentheses(s);
        System.out.println(res);
        // 4
    }

    @Test
    public void test3(){
        String s = "";
        int res = solver.longestValidParentheses(s);
        System.out.println(res);
        // 0
    }

    @Test
    public void test4(){
        String s = "()(()";
        int res = solver.longestValidParentheses(s);
        System.out.println(res);
        // 2
    }
}

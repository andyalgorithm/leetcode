import org.junit.Test;

import java.util.List;

public class GenerateParenthesisTest {

    GenerateParenthesis solver = new GenerateParenthesis();

    @Test
    public void test1(){
        int n = 3;
        List<String> res = solver.generateParenthesis(n);
        System.out.println(res);
        // [((())), (()()), (())(), ()(()), ()()()]
    }

    @Test
    public void test2(){
        int n = 1;
        List<String> res = solver.generateParenthesis(n);
        System.out.println(res);
        // [()]
    }
}

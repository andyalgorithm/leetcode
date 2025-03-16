package backTrack;

import org.junit.Test;

import java.util.ArrayList;

public class GenerateParenthesesTest {

    GenerateParentheses pat = new GenerateParentheses();

    @Test
    public void testOne() {
        ArrayList<String> res = pat.generateParentheses(3);
        for (String s: res) {
            System.out.println(s);
        }
    }
}

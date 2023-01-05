import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 151. 反转字符串中的单词
 */

public class ReverseWords2Test {
    ReverseWords2 solver = new ReverseWords2();

    @Test
    public void test1(){
        String s = "the sky is blue";
        String res = solver.reverseWords(s);
        System.out.println(res);
        // blue is sky the
    }

    @Test
    public void test2(){
        String s = "  hello world  ";
        String res = solver.reverseWords(s);
        System.out.println(res);
        // world hello
    }

    @Test
    public void test3(){
        String s = "a good   example";
        String res = solver.reverseWords(s);
        System.out.println(res);
        // example good a
    }

    @Test
    public void test(){
        StringBuilder res = new StringBuilder();
        HashMap<Integer, Integer> map;

    }
}

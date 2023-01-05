import org.junit.Test;

/**
 * 151. 反转字符串中的单词
 */

public class ReverseWordsTest {
    ReverseWords solver = new ReverseWords();

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
}

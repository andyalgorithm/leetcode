import org.junit.Test;

import java.util.List;

public class FullJustifyTest {
    FullJustify solver = new FullJustify();

    @Test
    public void test1(){
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> res = solver.fullJustify(words, maxWidth);
        System.out.println(res);
    }
}

import org.junit.Test;

import java.util.List;

public class CommonCharsTest {
    CommonChars solver = new CommonChars();

    @Test
    public void test1(){
        String[] words = {"bella","label","roller"};
        List<String> res = solver.commonChars(words);
        System.out.println(res);
        // [e, l, l]
    }

    @Test
    public void test2(){
        String[] words = {"cool","lock","cook"};
        List<String> res = solver.commonChars(words);
        System.out.println(res);
        // [c, o]
    }
}

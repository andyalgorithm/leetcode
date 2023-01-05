import org.junit.Test;

import java.util.List;

public class LetterCombinationsTest {
    LetterCombinations solver = new LetterCombinations();

    @Test
    public void test1(){
        String digits = "23";
        List<String> res = solver.letterCombinations(digits);
        System.out.println(res);
        // [ad, ae, af, bd, be, bf, cd, ce, cf]
    }

    @Test
    public void test2(){
        String digits = "";
        List<String> res = solver.letterCombinations(digits);
        System.out.println(res);
        // []
    }

    @Test
    public void test3(){
        String digits = "2";
        List<String> res = solver.letterCombinations(digits);
        System.out.println(res);
        // [a, b, c]
    }
}

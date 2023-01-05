import org.junit.Test;

import java.util.List;

public class LetterCasePermutationTest {
    LetterCasePermutation solver = new LetterCasePermutation();

//    @Test
    public void test(){
        char c1 = 'a';
        c1 ^= 32;
        System.out.println(c1); // A
        c1 ^= 32;
        System.out.println(c1); // a

        char c2 = 'A';
        c2 ^= 32;
        System.out.println(c2); // a
        c2 ^= 32;
        System.out.println(c2); // A
    }

    @Test
    public void test1(){
        String s = "a1b2";
        List<String> res = solver.letterCasePermutation(s);
        System.out.println(res);
    }

}

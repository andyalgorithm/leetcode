import org.junit.Test;

public class WordMaxProductTest {

    WordMaxProduct solver = new WordMaxProduct();

    @Test
    public void testOne() {

        String[] words = {"abcw","baz","foo","bar","fxyz","abcdef"};
        int res = solver.maxProduct(words);
        System.out.println(res);
        // 16
    }

    @Test
    public void testTwo() {

        String[] words = {"a","ab","abc","d","cd","bcd","abcd"};
        int res = solver.maxProduct(words);
        System.out.println(res);
        // 4
    }

    @Test
    public void testThree() {

        String[] words = {"a","aa","aaa","aaaa"};
        int res = solver.maxProduct(words);
        System.out.println(res);
        // 0
    }


}

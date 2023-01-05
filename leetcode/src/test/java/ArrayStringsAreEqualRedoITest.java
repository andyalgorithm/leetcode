import org.junit.Test;

public class ArrayStringsAreEqualRedoITest {

    ArrayStringsAreEqualRedoI solver = new ArrayStringsAreEqualRedoI();

    @Test
    public void test1() {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        boolean res = solver.arrayStringsAreEqual(word1, word2);
        System.out.println(res);
        // true
    }

    @Test
    public void test2() {
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};
        boolean res = solver.arrayStringsAreEqual(word1, word2);
        System.out.println(res);
        // false
    }

    @Test
    public void test3() {
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        boolean res = solver.arrayStringsAreEqual(word1, word2);
        System.out.println(res);
        // true
    }
}

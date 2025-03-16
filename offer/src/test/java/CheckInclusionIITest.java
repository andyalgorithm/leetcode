import org.junit.Test;

public class CheckInclusionIITest {

    CheckInclusionII solver = new CheckInclusionII();

    @Test
    public void test1() {
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean res = solver.checkInclusion(s1, s2);
        System.out.println(res);
        // true
    }

    @Test
    public void test2() {
        String s1 = "ab";
        String s2 = "eidboaoo";
        boolean res = solver.checkInclusion(s1, s2);
        System.out.println(res);
        // false
    }

    @Test
    public void test3() {
        String s1 = "ab";
        String s2 = "a";
        boolean res = solver.checkInclusion(s1, s2);
        System.out.println(res);
        // false
    }

    @Test
    public void test4() {
        String s1 = "adc";
        String s2 = "dcda";
        boolean res = solver.checkInclusion(s1, s2);
        System.out.println(res);
        // true
    }

    @Test
    public void test5() {
        String s1 = "hello";
        String s2 = "ooolleoooleh";
        boolean res = solver.checkInclusion(s1, s2);
        System.out.println(res);
        // false
    }
}

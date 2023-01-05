import org.junit.Test;

public class CheckInclusionTest {
    CheckInclusion solver = new CheckInclusion();

    @Test
    public void test1(){
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean res = solver.checkInclusion(s1, s2);
        System.out.println(res);
        // true
    }


    @Test
    public void test2(){
        String s1 = "ab";
        String s2 = "eidboaoo";
        boolean res = solver.checkInclusion(s1, s2);
        System.out.println(res);
        // false
    }
}

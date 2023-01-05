import org.junit.Test;

public class CheckOnesSegmentTest {
    CheckOnesSegment solver = new CheckOnesSegment();

    @Test
    public void test1(){
        String s = "1001";
        boolean res = solver.checkOnesSegment(s);
        System.out.println(res);
        // false
    }

    @Test
    public void test2(){
        String s = "110";
        boolean res = solver.checkOnesSegment(s);
        System.out.println(res);
        // true
    }
}

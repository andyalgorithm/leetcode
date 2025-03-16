package alibaba;

import org.junit.Test;

public class DuplicateLengthTest {

    DuplicateLength solver = new DuplicateLength();

    @Test
    public void testOne() {
        String str = "aa";
        int res = solver.duplicateLength(str);
        System.out.println(res);
        // 0
    }

    @Test
    public void testTwo() {
        String str = "abca";
        int res = solver.duplicateLength(str);
        System.out.println(res);
        // 2
    }

    @Test
    public void testThree() {
        String str = "cbzxy";
        int res = solver.duplicateLength(str);
        System.out.println(res);
        // -1
    }

    @Test
    public void testFour() {
        String str = "cabbac";
        int res = solver.duplicateLength(str);
        System.out.println(res);
        // 4
    }



}

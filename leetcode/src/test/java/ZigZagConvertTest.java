import org.junit.Test;

public class ZigZagConvertTest {
    ZigZagConvert solver = new ZigZagConvert();

    @Test
    public void test1(){
        String s = "PAYPALISHIRING";
        int row = 3;
        String res = solver.convert(s, row);
        System.out.println(res);
        // PAHNAPLSIIGYIR
    }

    @Test
    public void test2(){
        String s = "PAYPALISHIRING";
        int row = 4;
        String res = solver.convert(s, row);
        System.out.println(res);
        // PINALSIGYAHRPI
    }

    @Test
    public void test3(){
        String s = "A";
        int row = 1;
        String res = solver.convert(s, row);
        System.out.println(res);
        // A
    }

    @Test
    public void test4(){
        String s = "AB";
        int row = 1;
        String res = solver.convert(s, row);
        System.out.println(res);
        // AB
    }
}

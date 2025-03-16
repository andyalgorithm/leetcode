import org.junit.Test;

public class AddBinaryTest {

    AddBinary solver = new AddBinary();

    @Test
    public void testOne() {
        String a = "11";
        String b = "10";
        String res = solver.addBinary(a, b);
        System.out.println(res);
    }

    @Test
    public void testTwo() {
        String a = "1010";
        String b = "1011";
        String res = solver.addBinary(a, b);
        System.out.println(res);
    }
}

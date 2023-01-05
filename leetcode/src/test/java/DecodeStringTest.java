import org.junit.Test;

public class DecodeStringTest {
    DecodeString solver = new DecodeString();

    @Test
    public void test1(){
        String s = "3[a]2[bc]";
        String res = solver.decodeString(s);
        System.out.println(res);
    }
}

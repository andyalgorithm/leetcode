import org.junit.Test;

public class ReverseBitsTest {

    ReverseBits solver = new ReverseBits();

    @Test
    public void test1() {
        int n = 43261596;
        int res = solver.reverseBits(n);
        System.out.println(res);
        // 964176192
    }

//    @Test
    public void test2() {
        int n = 3;
        System.out.println(n<<1);
        // 6
        System.out.println(n<<1+1);
        // 12
        System.out.println((n<<1)+1);
        // 7
    }
}

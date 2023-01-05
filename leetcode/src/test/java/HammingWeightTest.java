import org.junit.Test;

public class HammingWeightTest {
    HammingWeight solver = new HammingWeight();

    @Test
    public void test1(){
        int n=11;
        int res = solver.hammingWeight(n);
        System.out.println(res);
        // 3
    }

    @Test
    public void test2(){
        int n=128;
        int res = solver.hammingWeight(n);
        System.out.println(res);
        // 1

    }

    @Test
    public void test3(){
        int n=-3;
        int res = solver.hammingWeight(n);
        System.out.println(res);
        // 31
    }
}

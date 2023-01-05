import org.junit.Test;

public class CountPrimesTest {
    CountPrimes solver = new CountPrimes();

    @Test
    public void test1(){
        int n = 10;
        int res = solver.countPrimes(n);
        System.out.println(res);
        // 4
    }

    @Test
    public void test2(){
        int n = 0;
        int res = solver.countPrimes(n);
        System.out.println(res);
        // 0
    }
}

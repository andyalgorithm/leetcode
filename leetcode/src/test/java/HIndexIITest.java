import org.junit.Test;

public class HIndexIITest {
    HIndexII solver = new HIndexII();

    @Test
    public void test1(){
        int[] citations = {0,1,3,5,6};
        int res = solver.hIndex(citations);
        System.out.println(res);
        // 3
    }

    @Test
    public void test2(){
        int[] citations = {1,2,100};
        int res = solver.hIndex(citations);
        System.out.println(res);
        // 2
    }

    @Test
    public void test3(){
        int[] citations = {0};
        int res = solver.hIndex(citations);
        System.out.println(res);
        // 0
    }

    @Test
    public void test4(){
        int[] citations = {100};
        int res = solver.hIndex(citations);
        System.out.println(res);
        // 1
    }


}

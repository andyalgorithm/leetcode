import org.junit.Test;

import java.util.List;

public class CombineTest {
    Combine solver = new Combine();

    @Test
    public void test1(){
        int n = 4;
        int k = 2;
        List<List<Integer>> res = solver.combine(n, k);

        for(List<Integer> t: res){
            System.out.println(t);
        }

        /**
         * [1, 2]
         * [1, 3]
         * [1, 4]
         * [2, 3]
         * [2, 4]
         * [3, 4]
         */
    }

    @Test
    public void test2(){
        int n = 1;
        int k = 1;
        List<List<Integer>> res = solver.combine(n, k);

        for(List<Integer> t: res){
            System.out.println(t);
        }

        // [1]
    }
}

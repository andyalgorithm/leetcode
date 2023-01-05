import org.junit.Test;

import java.util.List;

public class NQueensTest {
    NQueens solver = new NQueens();

    @Test
    public void test1(){
        int n = 4;
        List<List<String>> res = solver.solveNQueens(n);
        for(List<String> t: res){
            System.out.println(t);
        }
        /**
         * [.Q.., ...Q, Q..., ..Q.]
         * [..Q., Q..., ...Q, .Q..]
         */
    }

    @Test
    public void test2(){
        int n = 1;
        List<List<String>> res = solver.solveNQueens(n);
        for(List<String> t: res){
            System.out.println(t);
        }
        /**
         * [Q]
         */
    }
}

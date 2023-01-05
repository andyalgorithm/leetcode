import org.junit.Test;

import java.util.List;

public class NQueens2Test {
    NQueens2 solver = new NQueens2();

    @Test
    public void test1(){
        int n = 4;
        int res = solver.totalNQueens(n);
        System.out.println(res);
        // 2
    }

    @Test
    public void test2(){
        int n = 1;
        int res = solver.totalNQueens(n);
        System.out.println(res);
        // 1
    }


}

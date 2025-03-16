import org.junit.Test;

public class NumMatrixTest {

    @Test
    public void test1() {
        int[][] matrix = {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5},
        };
        NumMatrix solver = new NumMatrix(matrix);
        int res1 = solver.sumRegion(2,1,4,3);
        int res2 = solver.sumRegion(1,1,2,2);
        int res3 = solver.sumRegion(1,2,2,4);
        System.out.println(res1 +", "+ res2 +", "+ res3);
        // 8, 11, 12
    }

    @Test
    public void test2() {
        int[][] matrix = {
                {-4, -5},
        };
        NumMatrix solver = new NumMatrix(matrix);
        int res1 = solver.sumRegion(0,0,0,0);
        int res2 = solver.sumRegion(0,0,0,1);
        int res3 = solver.sumRegion(0,1,0,1);
        System.out.println(res1 +", "+ res2 +", "+ res3);
        // -4, -9, -5
    }
}

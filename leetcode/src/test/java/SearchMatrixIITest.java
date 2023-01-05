import org.junit.Test;

public class SearchMatrixIITest {
    SearchMatrixII solver = new SearchMatrixII();

    @Test
    public void test1(){
        int[][] matrix = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        int target = 5;
        boolean res = solver.searchMatrix(matrix, target);
        System.out.println(res);
        // true
    }

    @Test
    public void test2(){
        int[][] matrix = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        int traget = 20;
        boolean res = solver.searchMatrix(matrix, traget);
        System.out.println(res);
        // false
    }
}

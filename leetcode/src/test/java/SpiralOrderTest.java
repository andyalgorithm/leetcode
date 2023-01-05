import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

public class SpiralOrderTest {
    SpiralOrder solver = new SpiralOrder();

    @Test
    public void test1(){
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[] res = solver.spiralOrder(matrix);
        System.out.println(Arrays.toString(res));
        // [1, 2, 3, 6, 9, 8, 7, 4, 5]
    }

    @Test
    public void test2(){
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        int[] res = solver.spiralOrder(matrix);
        System.out.println(Arrays.toString(res));
        // [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
    }

    @Test
    public void tes(){
        Stack<Integer> stack = new Stack<>();
//        stack.peek()
    }
}

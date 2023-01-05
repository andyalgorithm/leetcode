import org.junit.Test;

public class MaxPointsTest {
    MaxPoints solver = new MaxPoints();

    @Test
    public void test1(){
        int[][] points = {
                {1,1},
                {2,2},
                {3,3}
        };
        int res = solver.maxPoints(points);
        System.out.println(res);
    }
}

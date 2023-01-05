import org.junit.Test;

import java.util.Arrays;

public class MergeIntervalsIITest {
    MergeIntervalsII solver = new MergeIntervalsII();

    @Test
    public void test1(){
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] res = solver.merge(intervals);
        for(int[] t: res){
            System.out.println(Arrays.toString(t));
        }
        /**
         * [1, 6]
         * [8, 10]
         * [15, 18]
         */
    }

    @Test
    public void test2(){
        int[][] intervals = {{1,4},{4,5}};
        int[][] res = solver.merge(intervals);
        for(int[] t: res){
            System.out.println(Arrays.toString(t));
        }
        /**
         * [1, 5]
         */
    }

    @Test
    public void test3(){
        int[][] intervals = {{1,4},{2,3}};
        int[][] res = solver.merge(intervals);
        for(int[] t: res){
            System.out.println(Arrays.toString(t));
        }
        /**
         * [1, 4]
         */
    }
}

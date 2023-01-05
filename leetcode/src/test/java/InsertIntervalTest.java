import org.junit.Test;

import java.util.Arrays;

public class InsertIntervalTest {
    InsertInterval solver = new InsertInterval();

    @Test
    public void test1(){
        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};
        int[][] res = solver.insert(intervals, newInterval);
        for(int[] t: res){
            System.out.println(Arrays.toString(t));
        }
        /**
         * [1, 5]
         * [6, 9]
         */
    }

    @Test
    public void test2(){
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};
        int[][] res = solver.insert(intervals, newInterval);
        for(int[] t: res){
            System.out.println(Arrays.toString(t));
        }
        /**
         * [1, 2]
         * [3, 10]
         * [12, 16]
         */
    }

    @Test
    public void test3() {
        int[][] intervals = {};
        int[] newInterval = {5, 7};
        int[][] res = solver.insert(intervals, newInterval);
        for (int[] t : res) {
            System.out.println(Arrays.toString(t));
        }
        // [5, 7]
    }

    @Test
    public void test4() {
        int[][] intervals = {{1, 5}};
        int[] newInterval = {2, 3};
        int[][] res = solver.insert(intervals, newInterval);
        for (int[] t : res) {
            System.out.println(Arrays.toString(t));
        }
        // [1, 5]
    }

}

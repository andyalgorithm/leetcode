package array.other;

import org.junit.Test;

import java.util.ArrayList;

public class IntervalListIntersectionsTest {

    IntervalListIntersections solver = new IntervalListIntersections();

    @Test
    public void testOne() {
        int[][] firstList = {{0,2},{5,10},{13,23},{24,25}};
        int[][] secondList = {{1,5}, {8,12},{15,24},{25,26}};
        ArrayList<ArrayList<Integer>> res = solver.intervalListIntersections(firstList, secondList);
        for(ArrayList<Integer> t: res) {
            System.out.println(t);
            /**
             * [1, 2]
             * [5, 5]
             * [8, 10]
             * [15, 23]
             * [24, 24]
             * [25, 25]
             */
        }

    }
}

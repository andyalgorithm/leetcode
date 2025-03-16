package DP;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumTriangleTotalTest {
    MinimumTriangleTotal solver = new MinimumTriangleTotal();

//    @Test
    public void test() {
        int res = Integer.MIN_VALUE;
        System.out.println(res+1);
        // -2147483647
    }

    @Test
    public void testOne(){
        int[][] nums = {{2},{3,4},{6,5,7},{4,1,8,3}};
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<nums[i].length; j++) {
                list.add(nums[i][j]);
            }
            triangle.add(list);
        }
        int res = solver.minimumTotal(triangle);
        System.out.println(res);
        // 11
    }

    @Test
    public void testTwo(){
        int[][] nums = {{-10}};
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<nums[i].length; j++) {
                list.add(nums[i][j]);
            }
            triangle.add(list);
        }
        int res = solver.minimumTotal(triangle);
        System.out.println(res);
        // -10
    }

}

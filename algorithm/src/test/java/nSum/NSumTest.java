package nSum;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class NSumTest {

    @Test
    public void testNSum() {
        int[][] nums = new int[][]{
                {},
                {1,5,3,2},
                {1,1,2,2,2,3,3,4},
                {2,2,2,2,2,2,2,2,2,2}
        };

        int[][][] expect = new int[][][]{
                {{}},
                {{1,2,3}},
                {{1,3,4},{2,2,4}},
                {{2,2,2}}
        };

        int[] target = new int[]{
                0,
                6,
                8,
                6
        };

        NSum solution = new NSum();
        for(int i=0;i<nums.length;i++) {
            ArrayList<ArrayList<Integer>> res = solution.nSum(nums[i], target[i], 3);
            assertNSum(res, expect[i], 3);
        }
    }

    @Test
    public void testNSum2() {
        int[][] nums = new int[][]{
                {},
                {1,5,3,2},
                {1,1,2,2,2,3,3,4,4},
                {2,2,2,2,2,2,2,2,2,2}
        };

        int[][][] expect = new int[][][]{
                {{}},
                {{1,2,3}},
                {{1,1,4,4},{2,2,3,3}},
                {{2,2,2,2,2,2}}
        };

        int[] target = new int[]{
                0,
                10,
                10,
                12
        };

        int []N = new int[] {
                0,
                3,
                4,
                6
        };

        NSum solution = new NSum();
        for(int i=0;i<nums.length;i++) {
            ArrayList<ArrayList<Integer>> res = solution.nSum(nums[i], target[i], N[i]);
            assertNSum(res, expect[i], N[i]);
        }

    }

    private void assertNSum(ArrayList<ArrayList<Integer>>res, int[][] expect,int n) {
        for(int i=0;i<res.size();i++) {
            int[] temp = new int[n];
            for(int j=0;j<res.get(i).size();j++) {
                temp[j] = res.get(i).get(j);
            }
            Assert.assertArrayEquals(temp, expect[i]);
        }
    }
}

package nSum;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TwoSumTest {

    @Test
    public void testTwoSum() {
        int[][] nums = new int[][]{
                {},
                {1,5,3,2},
                {1,1,2,2,2,3,3,4},
                {2,2,2,2,2,2,2,2,2,2}
        };

        int[][][] expect = new int[][][]{
                {{}},
                {{2,3}},
                {{1,3},{2,2}},
                {{2,2}}
        };

        int[] target = new int[]{
                0,
                5,
                4,
                4
        };

        TwoSum solution = new TwoSum();
        for(int i=0;i<nums.length;i++) {
            ArrayList<ArrayList<Integer>> res = solution.twoSum(nums[i], target[i]);
            assertNSum(res, expect[i], 2);
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

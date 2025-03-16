package DP;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 1035 不相交的线
 */

public class DisjointLines {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int res=0;
        int[][] memo = new int[nums1.length][nums2.length];
        for(int[] ints: memo){
            Arrays.fill(ints,-1);
        }

        res = dp(nums1, nums1.length-1, nums2, nums2.length-1, memo);
        return  res;
    }

    int dp(int[] nums1, int p1, int[] nums2, int p2, int[][] memo){
        if(p1<0 || p2<0) {
            return 0;
        }

        if(memo[p1][p2]!=-1) {
            return memo[p1][p2];
        }
        if(nums1[p1]==nums2[p2]) {
            memo[p1][p2] = dp(nums1, p1-1, nums2, p2-1, memo)+1;
        }else {
            memo[p1][p2] = Math.max(
                    dp(nums1, p1-1, nums2, p2, memo),
                    dp(nums1, p1, nums2, p2-1, memo)
                    );
        }

        return memo[p1][p2];
    }
}

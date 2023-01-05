import java.util.Arrays;

/**
 * 最大子数组和
 */

public class MaxSubArrayII {
    public int maxSubArray(int[] nums) {
        int res = nums[0];

        // 以nums[i]结尾的最大子数组
        int[] memo = new int[nums.length];
        Arrays.fill(memo, Integer.MAX_VALUE);
        memo[0] = nums[0];
        dp(nums.length-1, nums, memo);
        for(int n: memo) {
            res = Math.max(res, n);
        }

        return res;
    }

    int dp(int start, int[] nums, int[] memo) {
        if(memo[start]!=Integer.MAX_VALUE) {
            return memo[start];
        }

        int temp = dp(start-1, nums, memo);
        if(temp<0) {
            memo[start] = nums[start];
        }else {
            memo[start] = temp+nums[start];
        }
        return memo[start];
    }
}

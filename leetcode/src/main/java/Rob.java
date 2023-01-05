import java.util.Arrays;

/**
 * 198 打家劫舍
 */

public class Rob {

    public int rob(int[] nums) {
        int res = 0;
        int[] memo = new int[nums.length];
        Arrays.fill(memo,-1);
        res = dp(nums.length-1, nums, memo);
        return res;
    }

    int dp(int start, int[] nums, int[] memo) {
        if(start<0) {
            return 0;
        }

        if(memo[start]!=-1) {
            return memo[start];
        }

        memo[start] = Math.max(dp(start-1, nums, memo),
                dp(start-2, nums, memo)+nums[start]);
        return memo[start];
    }
}

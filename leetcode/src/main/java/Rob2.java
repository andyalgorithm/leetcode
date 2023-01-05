import java.util.Arrays;

/**
 * 213 打家劫舍II
 */

public class Rob2 {
    public int rob(int[] nums) {
        int res = nums[0];
        int[] memo = new int[nums.length];
        Arrays.fill(memo, -1);
        res = Math.max(res, dp(0, nums.length-2, nums, memo));
        Arrays.fill(memo, -1);
        res = Math.max(res, dp(1, nums.length-1, nums, memo));
        return res;
    }

    // 从右往左迭代
    int dp(int start, int end, int[] nums, int[] memo) {
        if(end<start) {
            return 0;
        }
        if(memo[end]!=-1) {
            return memo[end];
        }

        memo[end] = Math.max(dp(start,end-1, nums, memo),
                dp(start, end-2,  nums, memo)+nums[end]);

        return memo[end];
    }


}

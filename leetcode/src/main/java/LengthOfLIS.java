import java.util.Arrays;

/**
 * 300. 最长递增子序列
 */

public class LengthOfLIS {
    public int lengthOfLIS(int[] nums) {
        int[] memo=new int[nums.length];
        Arrays.fill(memo, -1);
        memo[0]=1;
        dp(nums.length-1, nums, memo);
        int res=1;
        for(int t: memo){
            res = Math.max(res, t);
        }

        return res;
    }

    int dp(int start, int[] nums, int[] memo){
        if(memo[start]!=-1){
            return memo[start];
        }

        int res=1;
        for(int i=start-1; i>=0; i--){
            int temp = dp(i, nums, memo);
            if(nums[i]<nums[start]){
                res = Math.max(res, temp+1);
            }
        }

        memo[start] = res;
        return memo[start];
    }
}

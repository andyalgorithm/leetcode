import java.util.Arrays;

/**
 * 918 环形子数组的最大和
 */

public class MaxSubarraySumCircular {
    public int maxSubarraySumCircular(int[] nums) {

        int res = Integer.MIN_VALUE, sum=0;
        int[] maxMemo = new int[nums.length];
        // 第i个结尾的最小值
        int[] minMemo = new int[nums.length];
        Arrays.fill(maxMemo, Integer.MAX_VALUE);
        Arrays.fill(minMemo, Integer.MAX_VALUE);
        for(int n: nums){
            sum += n;
        }

        dpMax(nums.length-1, nums, maxMemo);
        for(int t: maxMemo){
            res = Math.max(t, res);
        }

        // 如果小于0，那么表明其中的值均为负数
        if(res<0){
            return res;
        }

        dpMin(nums.length-1, nums, minMemo);

        for(int t: minMemo){
            res = Math.max(sum-t, res);
        }

        return res;
    }

    int dpMin(int start, int[] nums, int[] memo){
        if(start<0){
            return 0;
        }
        if(memo[start]!=Integer.MAX_VALUE){
            return memo[start];
        }
        memo[start] = Math.min(nums[start], nums[start]+dpMin(start-1, nums, memo));
        return memo[start];
    }

    int dpMax(int start, int[] nums, int[] memo){
        if(start<0){
            return 0;
        }
        if(memo[start]!=Integer.MAX_VALUE){
            return memo[start];
        }
        memo[start] = Math.max(nums[start], nums[start]+dpMax(start-1, nums, memo));
        return memo[start];
    }
}

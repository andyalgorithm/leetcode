import java.util.Arrays;

/**
 * 918 环形子数组的最大和
 */

public class MaxSubarraySumCircularII {
    public int maxSubarraySumCircular(int[] nums) {

        int res = 0, sum=0;
        int minSum = nums[0], maxSum=nums[0];
        // 以nums[i]为结尾的最小值/最大值
        int curMin=0, curMax=0;
        for(int n: nums){
            curMin = Math.min(curMin+n, n);
            minSum = Math.min(minSum, curMin);
            curMax = Math.max(curMax+n, n);
            maxSum = Math.max(maxSum, curMax);
            sum += n;
        }

        // 如果小于0，那么表明其中的值均为负数
        if(maxSum<0){
            res = maxSum;
        }else{
            res = Math.max(maxSum, sum-minSum);
        }

        return res;
    }


}

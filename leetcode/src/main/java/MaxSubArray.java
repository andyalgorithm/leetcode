/**
 * 最大子数组和
 */

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        int left = 0;
        for(int i=0; i<nums.length; i++) {
            sum+=nums[i];
            while (left<i && (nums[left]<0 || sum<0)) {
                sum -= nums[left];
                left++;
            }
            res = Math.max(res, sum);
        }

        while (left<nums.length-1) {
            sum -= nums[left];
            left++;
            res = Math.max(res, sum);
        }

        return res;
    }
}

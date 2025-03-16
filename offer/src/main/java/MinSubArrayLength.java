import java.util.Arrays;

/**
 * 008/209 和大于等于target的最短数组
 */

public class MinSubArrayLength {
    public int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE;

        int left=0, right=0;
        int sum = 0;
        while(right<nums.length) {
            sum += nums[right];

            while (sum>=target) {
                res= Math.min(right-left+1, res);
                sum -= nums[left];
                left++;
            }
           right++;
        }

        if(res==Integer.MAX_VALUE) {
            return 0;
        }

        return res;
    }
}

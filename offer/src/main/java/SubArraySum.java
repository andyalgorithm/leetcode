/**
 *  010/560 和为k的子数组
 */
public class SubArraySum {
    public int subarraySum(int[] nums, int k) {
        int res = 0;

        int left=0, right=0;
        int sum = 0;
        while(left<nums.length) {
            right = left;
            sum = 0;
            while(right<nums.length) {
                sum += nums[right];
                if(sum==k) {
                    res++;
                }
                right++;
            }
            left++;
        }

        return res;
    }
}

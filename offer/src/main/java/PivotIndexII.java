/**
 * 012/724 左右两边子数组的和相等
 */

public class PivotIndexII {
    public int pivotIndex(int[] nums) {
        int res = -1;
        int sum=0;

        int[] prefixSum = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            prefixSum[i] = sum;
        }

        sum=0;
        for(int i=0; i<nums.length; i++) {
            if(sum*2+nums[i]==prefixSum[nums.length-1]) {
                res = i;
                break;
            }
            sum = prefixSum[i];
        }

        return res;
    }
}

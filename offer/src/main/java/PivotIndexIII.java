/**
 * 012/724 左右两边子数组的和相等
 */

public class PivotIndexIII {
    public int pivotIndex(int[] nums) {
        int res = -1;

        int[] prefixSum = new int[nums.length+1];
        for(int i=1; i<prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i-1]+nums[i-1];
        }


        for(int i=1; i<prefixSum.length; i++) {
            if(prefixSum[i-1]*2+nums[i-1]==prefixSum[prefixSum.length-1]) {
                res = i-1;
                break;
            }
        }
        return res;
    }
}

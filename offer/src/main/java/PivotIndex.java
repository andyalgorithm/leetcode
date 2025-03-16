/**
 * 012/724 左右两边子数组的和相等
 */

public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int res = -1;
        if(nums.length==1) {
            res=0;
        }

        int[] prefixSum = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            if(i==0) {
                prefixSum[i] = nums[i];
            }else {
                prefixSum[i] = prefixSum[i-1]+nums[i];
            }
        }

        for(int i=0; i<nums.length; i++) {
            int value = prefixSum[nums.length-1]-prefixSum[i];
            if(i==0) {
                if(value==0) {
                    res = 0;
                    break;
                }
            }else {
                if(prefixSum[i-1]==value){
                    res = i;
                    break;
                }
            }
        }

        return res;
    }
}

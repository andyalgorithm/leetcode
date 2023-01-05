import java.util.Arrays;

/**
 * 16 最接近的三数之和
 */

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int res = nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            int start=i+1, end=nums.length-1;
            while (start<end){
                int sum = nums[start]+nums[end]+nums[i];
                if(Math.abs(target-sum)<Math.abs(target-sum)){
                    res = sum;
                }
                if(sum>target){
                    end--;
                }else if(sum<target){
                    start++;
                }else{
                    return res;
                }
            }
        }

        return res;
    }
}

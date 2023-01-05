import java.util.Arrays;

/**
 * 41. 缺失的第一个正数
 */

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int res = nums.length+1;
        for(int i=0; i<nums.length; i++){
            while (nums[i]>0 && nums[i]<=nums.length && nums[nums[i]-1]!=nums[i]){
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }


        return res;
    }
}

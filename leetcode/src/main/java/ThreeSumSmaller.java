import java.util.Arrays;

/**
 * 259. 较小的三数之和
 */
public class ThreeSumSmaller {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int res = 0;
        int left, right;
        for(int i=0; i<nums.length; i++){
            left = i+1;
            right = nums.length-1;
            while(left<right){
                int sum = nums[left]+nums[right]+nums[i];
                if(sum>=target){
                    right--;
                }else{
                    res = res + (right-left);
                    left++;
                }
            }
        }
        return res;
    }
}

/**
 *  26 删除有序数组中的重复项
 */

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int left=1, right=1;
        while (right<nums.length){
            if(nums[left-1]==nums[right]){
                right++;
            }else{
                nums[left] = nums[right];
                left++;
                right++;
            }
        }


        return left;
    }
}

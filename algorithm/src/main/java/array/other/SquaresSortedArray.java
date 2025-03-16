package array.other;

/**
 * 977 有序数组的平方
 */

public class SquaresSortedArray {

    int[] squaresSortedArray(int[] nums) {
        int[] res = new int[nums.length];
        int left=0, right=nums.length-1, index=nums.length-1;

        while (left<=right){
            if(Math.abs(nums[left])>Math.abs(nums[right])) {
                res[index] = nums[left]*nums[left];
                index--;
                left++;
            }else{
                res[index] = nums[right]*nums[right];
                index--;
                right--;
            }
        }

        return res;
    }
}

package prefixSum;

/**
 * 303. 区域和检索 - 数组不可变
 */

/**
 * 常规方法，每次都主次增加
 */
//public class NumArray {
//    private int[] nums;
//
//    public NumArray(int [] nums) {
//        this.nums = nums;
//    }
//
//
//    public int sumRange(int left, int right) {
//        int sum = 0;
//        for(int i=left;i<=right && i<nums.length;i++) {
//            sum += nums[i];
//        }
//        return sum;
//    }
//}


/**
 * 累加数据
 */
public class NumArray {
    private int[] nums;

    public NumArray(int [] nums) {
        this.nums = new int[nums.length+1];
        this.nums[0] = 0;
        for(int i=0;i<nums.length;i++) {
            this.nums[i+1] = this.nums[i] + nums[i];
        }
    }


    public int sumRange(int left, int right) {
        if(left<0 || left>right || right>=nums.length-1)
            return -1;
        return nums[right+1]-nums[left];
    }
}
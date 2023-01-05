/**
 * 287. 寻找重复数
 */

public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        // slow、fast均表示nums的索引值
        int slow=nums[0], fast=nums[nums[0]];
        while (slow!=fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        int pre=0;
        while (pre!=slow){
            pre = nums[pre];
            slow = nums[slow];
        }
        return slow;
    }
}

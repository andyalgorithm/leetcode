/**
 * 45 跳跃游戏II
 */

public class Jump {
    public int jump(int[] nums) {
        int left=0, right=0;
        int res = 0;
        while (right<nums.length-1) {
            int temp = right;
            while (left<=temp) {
                right = Math.max(right, left+nums[left]);
                left++;
            }
            res++;
        }

        return res;
    }
}

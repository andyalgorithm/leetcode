/**
 * 55 跳跃游戏
 */

public class CanJump {
    public boolean canJump(int[] nums) {
        boolean res = true;
        int k = 0;
        for(int i=0; i<nums.length; i++) {
            if(i>k) {
                return false;
            }
            k = Math.max(k, i+nums[i]);
        }

        return res;
    }
}

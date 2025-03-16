package backTrack;

/**
 * 494 目标和
 */

public class TargetSum {

    int sum = 0;
    int res = 0;

    public int targetSum(int[] nums, int target) {
//        int res = 0;
//        backtrack(0, target, nums, 0, res);

        backtrack(0, target, nums);

        return res;
    }

    void backtrack(int start, int target, int[] nums) {
        if(start==nums.length) {
            if(target == sum) {
                res +=1;
            }
            return;
        }

        sum += nums[start];
        backtrack(start+1, target, nums);
        sum -= nums[start];

        sum -= nums[start];
        backtrack(start+1, target, nums);
        sum += nums[start];

    }
}

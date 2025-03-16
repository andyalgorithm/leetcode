package backTrack;

/**
 * 494 目标和
 */

public class TargetSum2 {

//    int sum = 0;
    int res = 0;

    public int targetSum(int[] nums, int target) {
//        int res = 0;
//        backtrack(0, target, nums, 0, res);

        backtrack(0, target, nums, 0);

        return res;
    }

    void backtrack(int start, int target, int[] nums, int sum) {
        if(start==nums.length) {
            if(target == sum) {
                res +=1;
            }
            return;
        }

        sum += nums[start];
        backtrack(start+1, target, nums, sum);
        sum -= nums[start];

        sum -= nums[start];
        backtrack(start+1, target, nums, sum);
        sum += nums[start];

    }
}

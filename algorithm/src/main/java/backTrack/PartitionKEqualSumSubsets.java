package backTrack;

/**
 * 698 划分为k个相等的子集
 */

public class PartitionKEqualSumSubsets {

    public boolean partitionKEqualSumSubsets(int[] nums, int k) {
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
        }
        if(sum%k > 0) {
            return false;
        }

        int target = sum /k;
        boolean[] visited = new boolean[nums.length];

        boolean res = backtrack(k, nums, 0, visited, target);

        return res;
    }

    boolean backtrack(int k, int[] nums, int bucket, boolean[] visited, int target) {
        if(k==0) {
            return true;
        }

        //桶装满了，那么装下一个桶
        if(bucket==target) {
            return backtrack(k-1, nums, 0, visited, target);
        }

        for(int i=0; i<nums.length; i++) {
            if(visited[i]) {
                continue;
            }

            bucket += nums[i];
            visited[i] = true;
            if(backtrack(k, nums, bucket, visited, target)) {
                return true;
            }

            bucket-=nums[i];
            visited[i] = false;
        }

        return false;
    }
}

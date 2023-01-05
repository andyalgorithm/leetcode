import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 90. 子集II
 */



public class SubsetsWithDup {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        // 先进行排序
        Arrays.sort(nums);
        backtrack(0, nums, new ArrayList<>(), res);
        return res;
    }

    void backtrack(int start, int[] nums, List<Integer> temp, List<List<Integer>> res){
        if(start>nums.length){
            return;
        }
        res.add(new ArrayList<>(temp));

        for(int i=start; i<nums.length; i++){
            // 去重
            if(i>start && nums[i]==nums[i-1]){
                continue;
            }
            temp.add(nums[i]);
            backtrack(i+1, nums, temp, res);
            temp.remove(temp.size()-1);
        }
    }
}

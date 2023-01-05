import java.util.ArrayList;
import java.util.List;

/**
 * 78. 子集
 */

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        backtrack(0, nums, new ArrayList<>(), res);
        return res;
    }

    void backtrack(int start, int[] nums, List<Integer> temp, List<List<Integer>> res){
        if(start>nums.length){
            return;
        }
        res.add(new ArrayList<>(temp));

        for(int i=start; i<nums.length; i++){
            temp.add(nums[i]);
            backtrack(i+1, nums, temp, res);
            temp.remove(temp.size()-1);
        }
    }
}

package backTrack;

import java.util.ArrayList;

public class Subsets {

    public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        backtrack(0, nums, temp, res);

        return res;
    }

    void backtrack(int start,int[] nums, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> res) {
        res.add(new ArrayList<>(temp));

        for(int i=start; i<nums.length; i++) {
            temp.add(nums[i]);
            backtrack(i+1, nums, temp, res);
            temp.remove(temp.size()-1);
        }
    }
}

package backTrack;

/**
 * 46 全排列
 */

import java.util.ArrayList;

public class Permutations {

    ArrayList<ArrayList<Integer>> permutations(int[] nums) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtrack(nums, visited, temp, res);
        return res;
    }

    void backtrack(int[] nums, boolean[] visited, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> res) {
        if(nums.length==temp.size()) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0; i<nums.length;i++) {
            // 如果已经使用，那么直接跳过
            if(visited[i]) {
                continue;
            }
            temp.add(nums[i]);
            visited[i] = true;
            backtrack(nums, visited, temp, res);
            temp.remove(temp.size()-1);
            visited[i] = false;
        }



    }
}

package backTrack;

/**
 * 77 组合
 */

import java.util.ArrayList;

public class Combinations {

    public ArrayList<ArrayList<Integer>> combinations(int n, int k) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        boolean[] visited = new boolean[n];
        int[] nums = new int[n];
        for(int i=0;i<n;i++) {
            nums[i] = i+1;
        }
        backtrack(0, k, visited, nums, temp, res);

        return res;
    }

    void backtrack(int start, int k, boolean[] visited, int[] nums, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> res) {
        if(k==temp.size()) {
            res.add(new ArrayList<>(temp));
        }

        for(int i=start;i<nums.length;i++) {
            if(visited[i]) {
                continue;
            }
            temp.add(nums[i]);
            visited[i] = true;
            backtrack(i, k, visited, nums, temp, res);
            temp.remove(temp.size()-1);
            visited[i] = false;
        }
    }
    /**
     * [1, 2]
     * [1, 3]
     * [1, 4]
     * [2, 3]
     * [2, 4]
     * [3, 4]
     */

}

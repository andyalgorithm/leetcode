package backTrack;

/**
 * 39 组合总和
 */

import java.util.ArrayList;

public class CombinationSum {

    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        // 初始化值为false
//        boolean[] visited = new boolean[candidates.length];
        ArrayList<Integer> temp = new ArrayList<>();

        backtrack(0, candidates, target, temp, res);

        return res;
    }

    void backtrack(int start, int[] candidates, int target, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> res) {
        if(target == 0) {
            res.add(new ArrayList<>(temp));
            return;
        } else if(target < 0) {
            return;
        }

        //从当前的位置往后遍历，可以排除例如[2,2,3]和[2,3,2]的情况，最终得到[2,2,3]
        for(int i=start; i<candidates.length; i++) {
            temp.add(candidates[i]);
            backtrack(i, candidates, target-candidates[i], temp, res);
            temp.remove(temp.size()-1);
        }
    }
}

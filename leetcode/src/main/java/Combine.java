import java.util.ArrayList;
import java.util.List;

/**
 * 77. 组合
 */

public class Combine {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();

        backtrack(k, 1, n, new ArrayList<Integer>(), res);
        return res;
    }

    void backtrack(int k, int start, int n, List<Integer> temp,  List<List<Integer>> res){
        if(k==0){
            res.add(new ArrayList<>(temp));
        }
        for(int i=start; i<=n; i++){
            temp.add(i);
            backtrack(k-1, i+1, n, temp, res);
            temp.remove(temp.size()-1);
        }
    }
}

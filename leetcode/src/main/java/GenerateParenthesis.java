import java.util.ArrayList;
import java.util.List;

/**
 * 22 括号生成
 */

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        dp(0, 0, n, temp, res);

        return res;
    }

    void dp(int left, int right, int n, StringBuilder temp, List<String> res){
        if(left<right){
            return;
        }
        if(left==n && right==n){
            res.add(temp.toString());
        }
        if(left<n){
            temp.append('(');
            dp(left+1, right, n, temp, res);
            temp.deleteCharAt(temp.length()-1);
        }

        if(right<n){
            temp.append(')');
            dp(left, right+1, n, temp, res);
            temp.deleteCharAt(temp.length()-1);
        }

    }
}

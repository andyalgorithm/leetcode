package backTrack;

import java.util.ArrayList;

/**
 * 22 括号生成
 */


/**
 * 回溯算法
 * 左括号数不得小于右括号数
 */
public class GenerateParentheses {

    public ArrayList<String> generateParentheses(int n) {
        ArrayList<String> res = new ArrayList<>();
        backtrack(n, n, new StringBuilder(), res);
        return res;
    }

    void backtrack(int left, int right, StringBuilder s, ArrayList<String>res) {
        // 左括号数量小于右括号，表明括号不合法
        if(left > right) {
            return;
        }
        // 数量小于0，表示不合法
        if(left < 0 || right < 0) {
            return;
        }
        // 当所有的括号都恰好用完，表明合法
        if(left==0 && right==0) {
            res.add(new String(s));
            return;
        }

        // 添加左括号
        s.append('(');
        backtrack(left-1, right, s, res);
        // 撤销添加
        s.deleteCharAt(s.length()-1);

        // 添加右括号
        s.append(')');
        backtrack(left, right-1, s, res);
        // 撤销添加
        s.deleteCharAt(s.length()-1);



    }


}

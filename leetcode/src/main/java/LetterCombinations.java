import java.util.*;

/**
 * 17 电话号码的字母组合
 */

public class LetterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        list.add(new String(""));
        list.add(new String(""));
        list.add("abc");
        list.add("def");
        list.add("ghi");
        list.add("jkl");
        list.add("mno");
        list.add("pqrs");
        list.add("tuv");
        list.add("wxyz");

        // row-第row个digits；col-第row个digits对应字符串的第col个字符
        dp(0, digits, new StringBuilder(), list, res);

        return res;
    }

    void dp(int start, String digits, StringBuilder temp, ArrayList<String> list, List<String> res) {
        if (temp.length() == digits.length()) {
            res.add(new String(temp));
            return;
        }

        int t = digits.charAt(start) - '0';
        for (char c : list.get(t).toCharArray()) {
            // 添加
            temp.append(c);
            dp(start + 1, digits, temp, list, res);
            // 撤销
            temp.deleteCharAt(temp.length() - 1);
        }
    }


}

import java.util.ArrayList;
import java.util.List;

/**
 * 784. 字母大小写全排列
 */

public class LetterCasePermutation {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        backtrack(0, s.toCharArray(), res);
        return res;
    }

    void backtrack(int start, char[] s, List<String> res){
        if(start>s.length){
            return;
        }
        res.add(new String(s));

        for(int i=start; i<s.length; i++){
            if(Character.isDigit(s[i])) {
                continue;
            }

            // 每个字符的大小写形式刚好差了32，因此在大小写装换时可以用
            // 亦或--c^32c 来进行转换和恢复。
            s[i] ^= 32;
            backtrack(i+1, s, res);
            s[i] ^= 32;
        }
    }
}

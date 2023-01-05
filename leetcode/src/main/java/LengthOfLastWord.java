/**
 * 58 最后一个单词的长度
 */

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int right = s.length()-1;
        while (right>=0 && s.charAt(right)==' '){
            right--;
        }
        int len = 0;
        while (right>=0 && s.charAt(right)!=' '){
            right--;
            len++;
        }

        return len;
    }
}

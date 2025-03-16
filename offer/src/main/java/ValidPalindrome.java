/**
 * 019/680 最多删除一个字符得到回文串
 */

public class ValidPalindrome {

    public boolean validPalindrome(String s) {
        int left=0, right=s.length()-1;
        while(left<right) {
            if(s.charAt(left)==s.charAt(right)) {
                left++;
                right--;
            }else {
                return isPalindrome(left+1, right, s) || isPalindrome(left, right-1, s);
            }
        }
        return true;
    }

    boolean isPalindrome(int left, int right, String s) {
        while (left<right) {
            if(s.charAt(left)==s.charAt(right)) {
                left++;
                right--;
            }else {
                return false;
            }
        }
        return true;
    }
}

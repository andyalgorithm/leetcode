/**
 * 018/125 判断是否为回文串
 */

public class IsPalindrome {

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        boolean res = true;
        int left=0, right=s.length()-1;

        while (left<right) {
            char cl = s.charAt(left);
            if(('a'> cl || cl>'z') && ('0'>cl || '9'<cl)) {
                left++;
                continue;
            }

            char cr = s.charAt(right);
            if(('a'> cr || cr>'z') && ('0'>cr || '9'<cr)) {
                right--;
                continue;
            }

            if(s.charAt(left)==s.charAt(right)) {
                left++;
                right--;
            }else {
                res = false;
                break;
            }
        }
        return res;
    }
}

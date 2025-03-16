/**
 * `020/647 回文子字符串的个数`
 */


public class CountSubstrings {
    public int countSubstrings(String s) {
        int res = 0;
        int left, right;
        for(int i=0; i<s.length(); i++) {
            res++;

            // 奇数
            left=i-1;
            right=i+1;
            while(left>=0 && right<s.length()) {
                if(s.charAt(left)==s.charAt(right)) {
                    res++;
                    left--;
                    right++;
                }else {
                    break;
                }
            }

            // 偶数
            left=i-1;
            right=i;
            while (left>=0 && right<s.length()) {
                if(s.charAt(left)==s.charAt(right)) {
                    res++;
                    left--;
                    right++;
                }else {
                    break;
                }
            }
        }
        return res;
    }
}

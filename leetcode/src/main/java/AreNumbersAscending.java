/**
 * 2042 检查句子中的数字是否递增
 */
public class AreNumbersAscending {
    public boolean areNumbersAscending(String s) {
        int pre = 0, cur;

        int left=0, right=0;
        while(left<s.length()){
            char c = s.charAt(left);

            if(('0'<=c && c<='9') && ((left==0) ||
                    (s.charAt(left-1)<'0' || s.charAt(left-1)>'9'))){
                right = left+1;
                while(right<s.length()){
                    char t = s.charAt(right);
                    if(t<'0' || t>'9'){
                        break;
                    }else{
                        right++;
                    }
                }
                cur = Integer.parseInt(s.substring(left, right));
                if(cur<=pre){
                    return false;
                }else{
                    pre = cur;
                    left = right;
                }
            }else{
                left++;
            }
        }

        return true;
    }
}

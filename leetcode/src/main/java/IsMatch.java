/**
 * 10. 正则表达式匹配
 */

public class IsMatch {
    public boolean isMatch(String s, String p) {
        // 如果字符串长度为0，需要检测下正则串
        if(s.length()==0){
            // 如果正则串长度为奇数，必定不匹配，比如 "."、"ab*",必须是 a*b*这种形式，*在奇数位上
            if(p.length()%2!=0){
                return false;
            }

            for(int i=1; i<p.length();){
                if(p.charAt(i)!='*'){
                    return false;
                }
                i+=2;
            }
            return true;
        }

        // 如果字符串长度不为0，但是正则串没了，return false
        if(p.length()==0){
            return false;
        }

        // c是正则串当前位的后一位，如果存在的话，就更新一下
        char c = 'a';
        if(p.length()>1){
            c = p.charAt(1);
        }

        // 和dp一样，后一位分为是 '*' 和不是 '*' 两种情况
        if(c!='*'){
            // 如果该位字符一样，或是正则串该位是 '.',也就是能匹配任意字符，就可以往后走
            if(s.charAt(0)==p.charAt(0) || p.charAt(0)=='.'){
                return isMatch(s.substring(1), p.substring(1));
            }else{
                return false;
            }
        }else{
            // 如果该位字符一样，或是正则串该位是 '.'，和dp一样，有看和不看两种情况
            if(s.charAt(0)==p.charAt(0) || p.charAt(0)=='.'){
                return isMatch(s.substring(1), p) || isMatch(s, p.substring(2));
            }else{
                // 不一样，那么正则串这两位就废了，直接往后走
                return isMatch(s, p.substring(2));
            }
        }
    }

}

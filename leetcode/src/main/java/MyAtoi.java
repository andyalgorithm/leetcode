/**
 * 8 字符串转换整数
 */

public class MyAtoi {
    public int myAtoi(String s) {
        int res = 0;
        int sign = 1;

        s = s.trim();
        int index = 0;
        while (index<s.length()){
            if(s.charAt(index)==' '){
                index++;
            }else{
                break;
            }
        }
        if(index==s.length()){
            return res;
        }

        // 判断符号
        if(s.charAt(index)=='-'){
            sign = -1;
            index++;
        }else if(s.charAt(index)=='+'){
            index++;
        }



        while (index<s.length()) {
            int t = s.charAt(index)-'0';
            // 不在0-9范围
            if(t>9 || t<0){
                break;
            }
            if(res>Integer.MAX_VALUE/10 || (res==Integer.MAX_VALUE/10 && t>Integer.MAX_VALUE%10)){
                return Integer.MAX_VALUE;
            }else if(res<Integer.MIN_VALUE/10 || (res==Integer.MIN_VALUE/10) && -t<Integer.MIN_VALUE%10){
                return Integer.MIN_VALUE;
            }
            res = res*10 + sign*t;
            index++;
        }


        return res;
    }
}

/**
 * 58-II 左旋转字符串
 */

public class ReverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        char[] res = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            if(i<n){
                res[s.length()-n+i] = s.charAt(i);
            }else{
                res[i-n] = s.charAt(i);
            }
        }

        return new String(res);
    }
}

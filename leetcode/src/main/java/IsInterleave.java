/**
 * 96 字符串交织
 */

public class IsInterleave {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length()){
            return false;
        }
        boolean res = true;
        res = dp(0,0,0,s1,s2,s3);
        return res;
    }

    boolean dp(int start1, int start2, int start3, String s1, String s2, String s3){
        if(start3==s3.length()){
            return true;
        }else if(start1>s1.length() || start2>s2.length() || start3>s3.length()){
            return false;
        }

        boolean res1 = false, res2 = false;
        if(start1<s1.length() && s1.charAt(start1)==s3.charAt(start3)){
            res1 = dp(start1+1, start2, start3+1, s1, s2, s3);
        }

        if(start2<s2.length() && s2.charAt(start2)==s3.charAt(start3)){
            res2 = dp(start1, start2+1, start3+1, s1, s2, s3);
        }

        return res1 || res2;
    }
}

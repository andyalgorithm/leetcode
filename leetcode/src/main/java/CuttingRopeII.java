import java.util.Arrays;

/**
 * 343 剪绳子
 */

public class CuttingRopeII {
    public int cuttingRope(int n) {
        if(n<=3){
            return n-1;
        }

       int b = n%3, p = 1000000007;
        long res = 1, x = 3;
        for(int a=n/3-1; a>0; a=a/2){
            if(a%2==1){
                res = res*x%p;
            }
            x = x*x%p;
        }

        if(b==0){
            res = res*3%p;
        }else if(b==1){
            res = res*4%p;
        }else{
            res = res*6%p;
        }

        return (int)res;
    }

}

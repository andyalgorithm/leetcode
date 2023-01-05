/**
 * 50. 数值的整数次方
 */

public class MyPow {
    public double myPow(double x, int n) {
        if(n==0){
            return 1.0;
        }

        // 处理n为Integer最小值的情况。
        long nl = n;

        if(nl<0){
            x = 1/x;
            nl = -nl;
        }

        double res=1.0, temp=x;
        while (nl>0){
            if(nl % 2 == 1){
                res *= temp;
            }
            temp = temp*temp;
            nl = nl>>1;
        }
        return res;
    }
}

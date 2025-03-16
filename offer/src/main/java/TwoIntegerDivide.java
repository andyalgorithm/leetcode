/**
 * 001/29 整数整除
 */

public class TwoIntegerDivide {
    public int divide(int a, int b) {
        // 处理越界问题
        if(a==Integer.MIN_VALUE && b==-1) {
            return Integer.MAX_VALUE;
        }

        boolean negative = false;
        if((a>0 && b<0) || (a<0 && b>0)) {
            negative = true;
        }

        // 将整数都转换成负数，防止负数转换成整数导致越界
        if(a>0){
            a=-a;
        }
        if(b>0) {
            b=-b;
        }
        int res = 0;

        while(a<=b) {
            res++;
            a = a-b;
        }

        if(negative) {
            res = -res;
        }
        return res;
    }

}

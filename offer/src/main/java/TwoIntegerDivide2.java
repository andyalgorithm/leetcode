/**
 * 001/29 整数整除
 */

public class TwoIntegerDivide2 {
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
            int value =b;
            int k = 1;

            // 保证value + value不会溢出
            // 0xc0000000 是十进制 -2^30 的十六进制的表示
            // 判断 value >= 0xc0000000 的原因：保证 value + value 不会溢出
            // 可以这样判断的原因是：0xc0000000 是最小值 -2^31 的一半，
            // 而 a 的值不可能比 -2^31 还要小，所以 value 不可能比 0xc0000000 小
            // -2^31 / 2 = -2^30
            while(value>0xC0000000 && a<= value+value) {
                value += value;
                k += k;
            }
            res++;
            a = a-b;
        }

        if(negative) {
            res = -res;
        }
        return res;
    }

}

import org.omg.CORBA.INTERNAL;

import java.util.Stack;

/**
 * 7. 整数反转
 */

public class IntegerReverse {
    public int reverse(int x) {
        int res = 0;
        while (x!=0) {
            int temp = x % 10;
            if(res>Integer.MAX_VALUE/10 ||(res==Integer.MAX_VALUE/10 && temp>7)){
                return 0;
            }
            if(res< Integer.MIN_VALUE/10 || (res==Integer.MIN_VALUE/10 && temp<-8)){
                return 0;
            }
            res = res*10 + temp;
            x = x/10;
        }

        return  res;
    }
}
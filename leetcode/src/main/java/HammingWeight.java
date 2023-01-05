public class HammingWeight {
    public int hammingWeight(int n) {
        int res = 0;
        // 将负号位置为0，结果加一，此时n为正数
        if(n<0){
            res++;
            n = n & 0x7fffffff;
        }
        while(n>0){
             if((n & 1) == 1){
                 res++;
             }
            n = n>>1;
        }

        return res;
    }
}

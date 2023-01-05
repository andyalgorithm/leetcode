public class MySqrt {
    public int mySqrt(int x) {
        int res=0;
        long n = x;
        res = dp(x, n);
        return res;
    }

    int dp(int x, long n){
        if(n*n<=x){
            return (int)n;
        }
        n = (n+x/n)/2;
        return dp(x, n);
    }
}

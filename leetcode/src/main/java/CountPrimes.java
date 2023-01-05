import java.util.Arrays;

/**
 * 204 计数质数
 */

public class CountPrimes {
    public int countPrimes(int n) {
        if(n==0 || n==1){
            return 0;
        }
        int res = 0;
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i=2; i*i<n; i++){
            for(int j=i*i; j<n; j+=i){
                isPrime[j] = false;
            }
        }

        for(boolean t: isPrime){
            if(t) {
                res++;
            }
        }
        return res;
    }
}

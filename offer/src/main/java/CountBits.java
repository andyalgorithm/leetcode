/**
 * 003/338 前n个数字的二进制中1的个数
 */

public class CountBits {

    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for(int i=0; i<=n; i++) {
            res[i] = bits(i);
        }

        return res;
    }

    int bits(int n) {
        int count = 0;
        while(n>0) {
            count+=n%2;
            n = n>>1;
        }

        return count;
    }
}

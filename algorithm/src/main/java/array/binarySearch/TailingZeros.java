package array.binarySearch;

/**
 * 793. 阶乘函数后 K 个零
 * 解题思路：https://labuladong.github.io/algo/4/32/115/
 * 将问题转换成：n!可以分解成多少个因子5
 */

public class TailingZeros {

    public int tailingZeros(int n) {
        int m=5;
        int res = 0;
        while(n>=m) {
            res += n/m;
            m*=5;
        }
        return res;
    }
}

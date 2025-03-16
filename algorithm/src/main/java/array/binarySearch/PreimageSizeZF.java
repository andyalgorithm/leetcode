package array.binarySearch;

/**
 * 793. 阶乘函数后 K 个零
 * 如果存在解，那么个数一定是5个
 * 如果不存在解，那么返回0
 */

public class PreimageSizeZF {


    /**
     * 使用框架写法
     */
    int preimageSizeZF(long k) {
        int res=0;
        // 这里的左值和右值设定需要数学知识，这里不阐述，详情看
        // https://leetcode.cn/problems/preimage-size-of-factorial-zeroes-function/solution/jie-cheng-han-shu-hou-kge-ling-by-leetcode/

        // 确定边界
        long left = 4*k;
        long right = 4*k+5;
        boolean found = false;
        while(left<right) {
            long mid = (left+right)>>1;
            long sz = tailingZeros(mid);
            if(sz==k) {
                found = true;
                break;
            }else if(k>sz) {
                left = mid+1;
            }else {
                right = mid;
            }
        }
        if(found) {
            res = 5;
        }
        return res;
    }

    private long tailingZeros(long n) {
        long divisor=5;
        long res=0;
        while(n>=divisor) {
            res += n/divisor;
            divisor*=5;
        }
        return res;
    }
}

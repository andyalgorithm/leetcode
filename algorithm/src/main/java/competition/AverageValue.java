package competition;

/**
 * 2455 可被三整除的偶数的平均值
 */

public class AverageValue {
    public int averageValue(int[] nums) {
        int res = 0;
        int count = 0;
        for(int n: nums) {
            if(n%6==0) {
                res+=n;
                count++;
            }
        }
        if(count>0) {
            res = res/count;
        }
        return res;
    }
}

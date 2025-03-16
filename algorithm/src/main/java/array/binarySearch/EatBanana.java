package array.binarySearch;

public class EatBanana {

    public int eatBanana(int[] piles, int hour) {
        if(piles.length==0) {
            return -1;
        }
        if(piles.length==1) {
            return (piles[0]+hour-1)/hour;
        }

        int sum = 0;
        for(int t: piles) {
            sum += t;
        }

        int left = sum/hour;
        int right = sum;
        while(left<=right) {
            int mid = (left+right)>>1;
            int h = calHour(piles, mid);
            if(h==hour) {
                left=mid;
                break;
            }else if(h<hour) {
                right = mid;
            }else{
                left = mid+1;
            }
        }

        // 左边界处理
        while(left>0) {
            if(calHour(piles, left-1)<=hour) {
                left-=1;
            }else {
                break;
            }
        }

        return left;
    }

    private int calHour(int[] piles, int speed) {
        int hour = 0;
        for(int i=0;i<piles.length;i++) {
            hour += piles[i]/speed;
            if(piles[i]%speed>0) {
                hour += 1;
            }
        }
        return hour;
    }
}

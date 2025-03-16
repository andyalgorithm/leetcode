package array.binarySearch;

/**
 * 1011. 在 D 天内送达包裹的能⼒
 */

public class ShipWithinDays {

    public int shipWithinDays(int[] nums, int days) {
        int left = 0, right = 0;
        for (int var : nums) {
            left = Math.max(left, var);
            right += var;
        }

        while (left < right) {
            int mid = (left + right) >> 1;
            if (calDays(nums, mid)>days) {
                left = mid+1;

            }else {
                right=mid;
            }
        }
        return left;
    }

    private int calDays(int[] nums, int target) {
        int index = 0;
        int days = 0;

        while (index < nums.length) {
            int sum = 0;
            while (index<nums.length) {
                sum += nums[index];
                if(sum <= target)
                    index++;
                else
                    break;;
            }
            days++;
        }
//        System.out.println(target+"  "+days);
        return days;

    }

}

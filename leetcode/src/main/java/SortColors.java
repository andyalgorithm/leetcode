import java.util.Arrays;

/**
 * 75. 颜色分类
 */

public class SortColors {
    public void sortColors(int[] nums) {
        int left=0, right=nums.length-1;

    }

    void swap(int a, int b, int[] nums){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }


}

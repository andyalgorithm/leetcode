/**
 * 42. 接雨水
 */

public class Trap {
    public int trap(int[] height) {
        int res = 0;
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int temp=0;
        for(int i=0; i<height.length; i++){
           temp = Math.max(temp, height[i]);
           left[i] = temp-height[i];
        }
        temp = 0;
        for(int i=height.length-1; i>=0; i--){
            temp = Math.max(temp, height[i]);
            right[i] = temp-height[i];
        }
        for(int i=0; i<height.length; i++){
            res += Math.min(left[i], right[i]);
        }

        return res;
    }
}

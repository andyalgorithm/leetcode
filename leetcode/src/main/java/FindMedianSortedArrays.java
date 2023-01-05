/**
 * 字节-4寻找两个正序数组的中位数
 */

public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double res = 0.0;
        int size = nums1.length+nums2.length;
        int[] merge = new int[size];
        int left=0, right=0;
        int p = 0;
        while (p<size) {
            if(right>=nums2.length){
                merge[p] = nums1[left];
                left++;
            }else if(left>=nums1.length){
                merge[p] = nums2[right];
                right++;
            }else{
                if(nums1[left]<nums2[right]){
                    merge[p] = nums1[left];
                    left++;
                }else{
                    merge[p] = nums2[right];
                    right++;
                }
            }
            p++;
        }

        if(size%2==0) {
            res = (merge[size/2-1]+merge[size/2])/2.0;
        }else{
            res = merge[size/2];
        }
        return res;
    }
}

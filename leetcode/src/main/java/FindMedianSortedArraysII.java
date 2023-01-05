/**
 * 字节-4寻找两个正序数组的中位数
 */

public class FindMedianSortedArraysII {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double res = 0.0;
        int left=0, right=0;
        int p1=0, p2=0;
        int size = (nums1.length+nums2.length)/2;
        for(int i=0; i<=size; i++){
            left = right;
            if(p1<nums1.length && (p2>=nums2.length || nums1[p1]<nums2[p2])){
                right=nums1[p1];
                p1++;
            }else{
                right=nums2[p2];
                p2++;
            }
        }

        if(((nums1.length+nums2.length)%2==0)){
            res = (right+left)/2.0;
        }else{
            res = right;
        }

        return res;
    }
}

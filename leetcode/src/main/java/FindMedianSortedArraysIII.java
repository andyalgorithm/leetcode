/**
 * 字节-4寻找两个正序数组的中位数
 */

public class FindMedianSortedArraysIII {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double res = 0.0;
        int left=0, right=0;
        int p1=0, p2=0;
        int size = (nums1.length+nums2.length)/2;
        while(size>=0){
            left = right;
            int mid = Math.max(size/2,1);
            if((p1+mid)<=nums1.length && ((p2+mid)>nums2.length || nums1[p1+mid-1]<nums2[p2+mid-1])){
                right=nums1[p1+mid-1];
                p1=p1+mid;
            }else{
                right=nums2[p2+mid-1];
                p2=p2+mid;
            }
            size = size - mid;
        }

        if(((nums1.length+nums2.length)%2==0)){
            res = (right+left)/2.0;
        }else{
            res = right;
        }

        return res;
    }
}

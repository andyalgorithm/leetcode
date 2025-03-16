package array.other;

import java.util.ArrayList;

/**
 *  986 区间列表的交集
 */

public class IntervalListIntersections {

    ArrayList<ArrayList<Integer>> intervalListIntersections(int[][] nums1, int[][] nums2){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int left=0, right=0;
        while (left<nums1.length && right<nums2.length) {
            // nums1[left][0] 在 nums2[right]范围内 或 nums1[left][1] 在 nums2[right]范围内
            if((nums2[right][0]<= nums1[left][0] &&  nums1[left][0]<=nums2[right][1]) ||
                    (nums2[right][0]<=nums1[left][1] && nums1[left][1]<=nums2[right][1])) {
                int leftBound = Math.max(nums1[left][0], nums2[right][0]);
                int rightBound = Math.min(nums1[left][1], nums2[right][1]);
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(leftBound);
                arr.add(rightBound);
                res.add(arr);
            }
            if(nums1[left][1]<= nums2[right][1]) {
                left++;
            } else if(nums1[left][1]> nums2[right][1]) {
                right++;
            }
        }

        return res;

    }
}

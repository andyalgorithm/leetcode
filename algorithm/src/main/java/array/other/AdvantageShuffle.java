package array.other;

import java.util.*;

/**
 *  870 优势洗牌
 */

public class AdvantageShuffle {

    public int[] advantageShuffle(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        PriorityQueue<ArrayList<Integer>> queue = new PriorityQueue<>(
                (ArrayList<Integer>t1, ArrayList<Integer>t2) -> {
                    // 从大到小排序
                    return t2.get(1)-t1.get(1);
                }
        );
        for(int i=0; i<nums2.length; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(i);
            arr.add(nums2[i]);
            queue.add(arr);
        }

        Arrays.sort(nums1);

        int left = 0, right = nums1.length-1;


        while(left<=right) {
            // 获取nums2的最大值
            ArrayList<Integer> arr = queue.poll();
            assert arr != null;
            int index = arr.get(0);
            int value = arr.get(1);

            if(nums1[right]>value) {
                res[index] = nums1[right];
                right--;
            }else{
                res[index] = nums1[left];
                left++;
            }
        }

        return res;
    }
}

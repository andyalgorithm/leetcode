package array.slideWindow;

import java.util.HashMap;


public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        int res=0;
        int left=0, right=0;
        while(right<s.length()) {
            char key = s.charAt(right);
            // 若key不存在，则创建该key值，并设置默认value值为0
            map.put(key, map.getOrDefault(key,0)+1);
            right++;
            // 左侧窗口是否收缩
            while(map.get(key)>1) {
                char temp = s.charAt(left);
                map.replace(temp,map.get(temp)-1);
                left++;
            }
            res = Math.max(res, right-left);
        }

        return res;

    }
}

import java.util.Arrays;
import java.util.HashMap;

/**
 * 014/567 字符串中的变位
 */

public class CheckInclusionII {

    public boolean checkInclusion(String s1, String s2) {
        boolean res = false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int count=0;

        for(int i=0; i<s1.length(); i++) {
            char c = s1.charAt(i);
            map1.put(c, map1.getOrDefault(c, 0)+1);
        }


        int left=0, right=0;

        while(right<s2.length()) {
            // 左窗口右移
            if(right-left>=s1.length()) {
                char t = s2.charAt(left);
                map2.put(t, map2.get(t)-1);
                // 左指针移除的是有效字符，并且map1[t]>map2[t]，那么有效字符数量减1
                if(map1.getOrDefault(t,0)>map2.get(t)) {
                    count--;
                }
                // 左指针右移
                left++;
            }

            // 右窗口右移
            char c = s2.charAt(right);
            map2.put(c, map2.getOrDefault(c, 0)+1);

            // 判断有效字符的个数
            if(map2.get(c)<= map1.getOrDefault(c, 0)) {
                count++;
            }

            if(count==s1.length()) {
                return true;
            }
            right++;
        }
        return res;
    }




}

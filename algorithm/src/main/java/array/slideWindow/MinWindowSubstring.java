package array.slideWindow;

/**
 * 76. 最⼩覆盖⼦串
 */

import java.util.HashMap;

public class MinWindowSubstring {

    public String minWindowSubstring(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();

        // 对参数进行处理
        for(int i=0; i<t.length(); i++) {
            char c = t.charAt(i);
            need.put(c, need.getOrDefault(c, 0)+1);
        }

        int left=0, right=0;
        int count=0;
        String res="";
        int tleft=-1,tright=s.length();

        // 扩张
        while(right<s.length()) {
            char c = s.charAt(right);
            right++;
            map.put(c, map.getOrDefault(c, 0)+1);
            if(map.get(c).equals(need.getOrDefault(c, 0))) {
                count++;
            }

            // 收缩
            while(count==need.size()) {
                if(tright-tleft > right-left) {
                    tleft = left;
                    tright = right;
                }

                char tt = s.charAt(left);
                left++;
                if(map.get(tt).equals(need.getOrDefault(tt,0))) {
                    count--;
                }
                map.replace(tt, map.get(tt)-1);
            }
        }

        if(tleft<0) {
            return "";
        }else {
            return s.substring(tleft, tright);
        }
    }
}

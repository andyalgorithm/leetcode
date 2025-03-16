package array.slideWindow;

import java.util.HashMap;

/**
 * 567. 字符串的排列
 */

public class Permutation {

    public boolean permutation(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();

        int left=0, right=0;
        int count=0;

        // 参数初始化
        for(int i=0; i<s1.length();i++) {
            char c = s1.charAt(i);
            need.put(c, need.getOrDefault(c, 0)+1);
        }

        while(right<s2.length()) {
            char c = s2.charAt(right);
            map.put(c, map.getOrDefault(c,0)+1);
            if(map.get(c).equals(need.getOrDefault(c, 0))) {
                count++;
            }
            right++;


            while(right-left>=s1.length()) {
                if(right-left==count) {
                    return true;
                }

                char t = s2.charAt(left);
                if(map.get(t).equals(need.getOrDefault(t, 0))) {
                    count --;
                }
                map.replace(t, map.get(t)-1);
                left++;

            }
        }
        return false;

    }
}

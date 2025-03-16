package array.slideWindow;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 438. 找到字符串中所有字⺟异位词
 */

public class FindAnagrams{

    public ArrayList<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();
        int count=0;

        // 对need进行初始化
        for(int i=0;i<p.length();i++) {
            char c = p.charAt(i);
            need.put(c, need.getOrDefault(c, 0)+1);
        }

        ArrayList<Integer> res = new ArrayList<>();
        int left = 0, right=0;
        while(right<s.length()) {
            char c = s.charAt(right);

            // 进行窗口数据更新
            map.put(c, map.getOrDefault(c,0)+1);
            right++;
            if(map.getOrDefault(c, 0).equals(need.getOrDefault(c, 0))) {
                count++;
            }
            while(right-left>=p.length()) {

                // 进行窗口数据更新
                if(count==p.length()) {
                    res.add(left);
                }
                char t = s.charAt(left);
                if(map.get(t).equals(need.getOrDefault(t, 0))) {
                    count--;
                }
                map.replace(t, map.get(t)-1);
                left++;
            }

        }

        return res;
    }

}

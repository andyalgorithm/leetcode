import java.util.HashMap;

/**
 * 017/76 含有所有字符的最短字符串
 */

public class MinWindow {
    public String minWindow(String s, String t) {
        String res="";
        int count=0; // 窗口内含有有效字符的个数

        HashMap<Character, Integer> mapt = new HashMap<>();
        HashMap<Character, Integer> maps = new HashMap<>();
        for(int i=0; i<t.length(); i++) {
            char c = t.charAt(i);
            mapt.put(c, mapt.getOrDefault(c, 0)+1);
        }

        int left=0;
        for(int i=0; i<s.length(); i++) {
            char c  = s.charAt(i);
            maps.put(c, maps.getOrDefault(c, 0)+1);
            // 这里maps[c]>=1，c为有效值
            if(maps.get(c)<= mapt.getOrDefault(c, 0)) {
                count++;
            }

            // 右移左边界
            while(left<=i && mapt.getOrDefault(s.charAt(left), 0)<maps.getOrDefault(s.charAt(left), 0)) {
                maps.put(s.charAt(left), maps.get(s.charAt(left))-1);
                left++;
            }


            if(count==t.length()) {
                if(res.equals("") || res.length()>i+1-left) {
                    res = s.substring(left, i+1);
                }
            }
        }
        return res;

    }
}

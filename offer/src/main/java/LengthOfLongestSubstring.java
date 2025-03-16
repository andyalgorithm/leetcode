import java.util.HashMap;

/**
 * 016/3 不含重复字符的最长字符串
 */

public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int left=0, right=0;
        while(right<s.length()) {
            char cr = s.charAt(right);
            map.put(cr, map.getOrDefault(cr, 0)+1);

            while(map.get(cr)==2) {
                char cl = s.charAt(left);
                map.put(cl, map.get(cl)-1);
                left++;
            }

            res = Math.max(res, right-left+1);

            right++;
        }

        return res;
    }
}

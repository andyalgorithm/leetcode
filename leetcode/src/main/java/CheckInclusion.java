import java.util.HashMap;

/**
 * 567. 字符串的排列
 */

public class CheckInclusion {

    public boolean checkInclusion(String s1, String s2) {
        int count = 0;
        int left=0, right=0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i=0; i<s1.length(); i++){
            char c1 = s1.charAt(i);
            map1.put(c1, map1.getOrDefault(c1, 0)+1);
        }

        for(int i=0; i<s1.length(); i++){
            char c = s2.charAt(i);
            map2.put(c, map2.getOrDefault(c, 0)+1);
            if(map2.get(c)<=map1.getOrDefault(c,0)){
                count++;
            }
            right++;
        }
        if(count==s1.length()){
            return true;
        }

        while(right<s2.length()){
            char c1 = s2.charAt(left);
            char c2 = s2.charAt(right);
            map2.put(c2, map2.getOrDefault(c2, 0)+1);
            if(map2.get(c2)<=map1.getOrDefault(c2, 0)){
                count++;
            }
            map2.put(c1, map2.get(c1)-1);
            if(map2.get(c1)<map1.getOrDefault(c1, 0)){
                count--;
            }

            left++;
            right++;
            if(count==s1.length()){
                return true;
            }
        }


        return false;
    }
}
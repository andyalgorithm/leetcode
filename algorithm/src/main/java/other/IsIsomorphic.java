package other;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 205 同构字符串
 */

public class IsIsomorphic {

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        HashSet<Character> visited = new HashSet<>();
        int p=0;
        while(p<s.length()){
            char c1 = s.charAt(p);
            char c2 = t.charAt(p);

            // s --> t
            // 之前有映射值与当前值不同
            if(map.containsKey(c1) && map.get(c1)!=c2){
                return false;
            }

            // 当前没有映射值，但映射的目标值已经存在，即多个起点映射到一个终点
            if(!map.containsKey(c1) && visited.contains(c2)){
                return false;
            }

            if(!map.containsKey(c1)) {
                map.put(c1, c2);
                visited.add(c2);
            }

            p++;
        }
        return true;
    }
}

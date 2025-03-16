package alibaba;

import java.util.HashMap;

public class DuplicateLength {

    int duplicateLength(String str) {
        int res = -1;

        HashMap<Character, Integer> map = new HashMap<>();
        int pos=0;

        // 移动位置
        while(pos<str.length()) {
            char c = str.charAt(pos);

            if(map.containsKey(c)) {
                res = Math.max(res, pos-map.get(c)-1);
                map.replace(c, pos);
            } else {
                map.put(c, pos);
            }
            pos++;
        }


        return res;
    }

}

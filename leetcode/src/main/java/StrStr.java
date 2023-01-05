import java.util.HashMap;

/**
 * 28. 找出字符串第一个匹配项的下标
 */

public class StrStr {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()){
            return -1;
        }
        int res = -1;
        int left=0, right=needle.length();
        int count = 0;
        HashMap<Character, Integer> needleMap = new HashMap<>();
        HashMap<Character, Integer> stackMap = new HashMap<>();
        for(char c: needle.toCharArray()){
            needleMap.put(c, needleMap.getOrDefault(c,0)+1);
        }
        for(char c: haystack.toCharArray()){
            stackMap.put(c, stackMap.getOrDefault(c,0)+1);
            if(stackMap.get(c)<=needleMap.getOrDefault(c, 0)){
                count++;
            }
        }

        while (right<haystack.length()){
            if(count==needle.length()){
                if(needle.equals(haystack.substring(left, right))){
                    return left;
                }
            }
            char c1 = haystack.charAt(right);
            stackMap.put(c1, stackMap.getOrDefault(c1, 0)+1);
            if(stackMap.get(c1)<=needleMap.getOrDefault(c1, 0)){
                count++;
            }

            char c2 = haystack.charAt(left);
            stackMap.put(c2, stackMap.getOrDefault(c2, 0)-1);
            if(stackMap.get(c2)<needleMap.getOrDefault(c2, 0)){
                count--;
            }
            left++;
            right++;

        }

        if(count==needle.length()){
            if(needle.equals(haystack.substring(left, right))){
                return left;
            }
        }

        return -1;
    }
}

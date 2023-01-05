import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1002. 查找共用字符
 */

public class CommonChars {
    public List<String> commonChars(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> temp = new HashMap<>();
        List<String> res = new ArrayList<>();
        for(char c: words[0].toCharArray()){
            temp.put(c, temp.getOrDefault(c, 0)+1);
        }
        for(int i=1; i<words.length; i++){
            map = temp;
            temp = new HashMap<>();
            for(char c: words[i].toCharArray()){
                if(map.getOrDefault(c, 0)>0){
                    map.put(c, map.get(c)-1);
                    temp.put(c, temp.getOrDefault(c, 0)+1);
                }
            }
        }

        for(Map.Entry<Character, Integer> t: temp.entrySet()){
            for(int i=0; i<t.getValue(); i++){
                res.add(t.getKey().toString());
            }
        }

        return res;
    }
}

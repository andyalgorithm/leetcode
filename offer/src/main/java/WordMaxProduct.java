import java.util.ArrayList;
import java.util.HashSet;

/**
 * 005/318  单词长度最大乘积
 */

public class WordMaxProduct {
    public int maxProduct(String[] words) {
        int res = 0;
        ArrayList<HashSet<Character>> sets = new ArrayList<HashSet<Character>>();

        // 添加进入集合
        for(int i=0; i<words.length; i++) {
            HashSet<Character> set = new HashSet<>();
            for(int j=0; j<words[i].length(); j++) {
                set.add(words[i].charAt(j));
            }
            sets.add(set);
        }

        for(int i=0; i<sets.size(); i++) {
            for(int j=i+1; j<sets.size(); j++) {
                boolean valid = true;
                for(char c: sets.get(j)) {
                    if(sets.get(i).contains(c)) {
                        valid = false;
                        break;
                    }
                }
                if(valid) {
//                    System.out.println(words[i] + ", " + words[j]);
                    res = Math.max(res, words[i].length() * words[j].length());
                }
            }
        }
        return res;

    }
}

import java.util.HashMap;

/**
 * 792. 匹配子序列的单词数
 */

public class NumMatchingSubseq {
    public int numMatchingSubseq(String s, String[] words) {
        int res = 0;

        // 去重
        HashMap<String, Integer> map = new HashMap<>();
        for(String word: words){
            map.put(word, map.getOrDefault(word, 0)+1);
        }


        for(String word: map.keySet()){
            if(isMatch(s, word)) {
                res += map.get(word);
            }
        }

        return  res;
    }

    boolean isMatch(String s, String word){
        int left=0, right=0;
        while (left<s.length() && right<word.length()){
            if(s.charAt(left)==word.charAt(right)){
                left++;
                right++;
            }else{
                left++;
            }
        }

        return right==word.length();
    }
}

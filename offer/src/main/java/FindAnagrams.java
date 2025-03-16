import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 015/438 字符串中所有的变位词
 */

public class FindAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        if(s.length()<p.length()) {
            return res;
        }

        for(int i=0; i<p.length(); i++) {
            arr1[s.charAt(i)-'a']++;
            arr2[p.charAt(i)-'a']++;
        }

        if(Arrays.equals(arr1, arr2)) {
            res.add(0);
        }

        for(int i=p.length(); i<s.length(); i++) {
            int preIndex = s.charAt(i-p.length())-'a';
            int curIndex = s.charAt(i)-'a';
            arr1[preIndex]--;
            arr1[curIndex]++;
            if(Arrays.equals(arr1, arr2)) {
                res.add(i+1-p.length());
            }
        }

        return res;
    }
}

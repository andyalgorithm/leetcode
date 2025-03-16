import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 014/567 字符串中的变位
 */

public class CheckInclusion {

    public boolean checkInclusion(String s1, String s2) {
        boolean res = false;
        int[] arr1= new int[26];
        int[] arr2 = new int[26];

        if(s1.length()>s2.length()) {
            return false;
        }

        for(int i=0; i<s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            arr1[c1-'a'] += 1;
            arr2[c2-'a'] += 1;
        }
        if(Arrays.equals(arr1, arr2)) {
            return true;
        }

        int left=0, right=s1.length();

        while(right<s2.length()) {
            int c1 = s2.charAt(left) - 'a';
            int c2 = s2.charAt(right) - 'a';
            arr2[c1]--;
            arr2[c2]++;
            if(Arrays.equals(arr1, arr2)) {
                return true;
            }

            left++;
            right++;
        }
        return res;
    }




}

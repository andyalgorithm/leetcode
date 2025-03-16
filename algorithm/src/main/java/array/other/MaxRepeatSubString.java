package array.other;

/**
 *  1668 最大重复子字符串
 */

public class MaxRepeatSubString {
    public int maxRepeating(String sequence, String word) {
        int res = 0;
        int pos=0, p1=0, p2=0;
        while(pos<sequence.length()) {
            res = Math.max(numberOfSubstring(sequence, word, pos), res);
            pos++;
        }

        return res;

    }

    int numberOfSubstring(String sequence, String word, int p1){
        int res = 0;
        for(int i=p1; i<=sequence.length()-word.length(); i+=word.length()){
            for(int j=0; j<word.length();j++) {
                if (sequence.charAt(i+j) != word.charAt(j)) {
                    return res;
                }
            }
            res++;
        }

        return res;
    }
}
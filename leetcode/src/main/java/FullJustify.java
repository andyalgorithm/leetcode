import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 68 文本左右对齐
 */

public class FullJustify {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        int left=0, right=0;
        while (right<words.length){
            left = right;
            int size = 0;

            while (right<words.length){
                if(size+words[right].length()+right-left>maxWidth){
                    break;
                }
                size += words[right].length();
                right++;
            }
            int space = 0;
            if(right-left>1){
                space = (maxWidth-size)/(right-left-1);
            }
            addWords(left, right-1, space, maxWidth, words, res);
        }

        return res;
    }

    void addWords(int left, int right, int space, int maxWidth, String[] words, List<String> res){

    }
}

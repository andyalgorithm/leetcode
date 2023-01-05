import java.util.ArrayList;
import java.util.Arrays;

/**
 * 1592 重新排列单词间的空格
 */

public class RecordSpaces {
    public String reorderSpaces(String text) {
        char[] res = new char[text.length()];
        Arrays.fill(res, ' ');
        ArrayList<ArrayList<Character>> list = new ArrayList<>();
        int space = 0;
        for(int i=0; i<text.length();){
            if(text.charAt(i)!=' ') {
                ArrayList<Character> temp = new ArrayList<>();
                while (i < text.length() && text.charAt(i) != ' ') {
                    temp.add(text.charAt(i));
                    i++;
                }
                list.add(temp);
            }else{
                i++;
                space++;
            }
        }

        if(list.size()>1){
            space = space/(list.size()-1);
        }
        for(int i=0, index=0; i<list.size(); i++){
            for(char c: list.get(i)) {
                res[index] = c;
                index++;
            }
            if(list.size()-i>1){
                index = index + space;
            }
        }

        return new String(res);
    }
}

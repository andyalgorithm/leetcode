/**
 * 151. 反转字符串中的单词
 */

public class ReverseWords {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        String[] splits = s.trim().split(" ");
        for(int i=splits.length-1; i>=0; i--){
            if(splits[i].equals("")){
                continue;
            }
            res.append(splits[i]);
            if(i>0){
                res.append(' ');
            }

        }

        return res.toString();
    }


}
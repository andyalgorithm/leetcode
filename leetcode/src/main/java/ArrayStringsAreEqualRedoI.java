/**
 * 1662 检查两个字符串是否相等
 */

public class ArrayStringsAreEqualRedoI {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int row1=0,col1=0;
        int row2=0,col2=0;
        while(row1<word1.length && row2<word2.length){
            if(col1==word1[row1].length() || col2==word2[row2].length()){
                if(col1==word1[row1].length()){
                    row1++;
                    col1=0;
                }
                if(col2==word2[row2].length()){
                    row2++;
                    col2=0;
                }
            }else if(word1[row1].charAt(col1)!=word2[row2].charAt(col2)){
                    return false;
            }else{
                col1++;
                col2++;
            }
        }

        if(row1==word1.length && row2==word2.length){
            return true;
        }else{
            return false;
        }

    }
}

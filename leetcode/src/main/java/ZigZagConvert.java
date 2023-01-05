import java.util.ArrayList;
import java.util.List;

/**
 * 6. Z形变换
 */

public class ZigZagConvert {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        StringBuilder res = new StringBuilder();
        List<StringBuilder> list = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            list.add(new StringBuilder());
        }
        int dir= -1; // 行方向，默认向下
        int row = 0;
        for(char c: s.toCharArray()){
            list.get(row).append(c);
            if(row==0 || row==numRows-1){
                dir = -dir;
            }
            row += dir;
        }
        for(StringBuilder t: list){
            res.append(t);
        }

        return res.toString();
    }
}

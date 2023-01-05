import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 12 整数转罗马数字
 */

public class IntToRoman {
    public String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
        while (num>0){
            for(Map.Entry<Integer, String> t: map.entrySet()){
                if(t.getKey()<=num){
                    res.append(t.getValue());
                    num -= t.getKey();
                    break;
                }
            }
        }

        return res.toString();
    }
}

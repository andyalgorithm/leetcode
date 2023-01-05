import java.util.Arrays;

/**
 * 43. 字符串相乘
 */

public class Multiply {
    public String multiply(String num1, String num2){
        if(num1.length()==0 || num2.length()==0 || num1.equals("0") || num2.equals("0")){
            return "0";
        }
        int[] res = new int[num1.length()+num2.length()];

        int temp=0;
        for(int i=num1.length()-1; i>=0; i--){
            int n1 = num1.charAt(i)-'0';
            for(int j=num2.length()-1; j>=0; j--){
                int n2 = num2.charAt(j) - '0';
                temp = n1*n2+res[i+j+1];
                res[i+j+1] = temp%10;
                res[i+j] += temp/10;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<res.length; i++){
            if(i==0 && res[i]==0){
                continue;
            }
            sb.append(res[i]);
        }

        return sb.toString();
    }


}

package DP;

import java.util.Scanner;

/**
 * 字节跳动 -- 古生物血缘远近判定
 */

public class BloodSimilarity {

    public int bloodSimilarity(String str1, String str2){
        int res = 0;

        res = traverse(str1, 0, str2, 0, 0);
        return res;
    }

    int traverse(String str1, int pos1, String str2, int pos2, int res){
        if(pos1==str1.length()) {
            return res+str2.length()-pos2;
        }else if(pos2==str2.length()){
            return res+str1.length()-pos1;
        }

        if(str1.charAt(pos1)==str2.charAt(pos2)) {
            return traverse(str1, pos1+1, str2, pos2+1, res);
        }

        int res1 = traverse(str1, pos1+1, str2, pos2, res+1);
        int res2 = traverse(str1, pos1, str2, pos2+1, res+1);
        int res3 = traverse(str1, pos1+1, str2, pos2+1, res+1);
        return Math.min(res1, Math.min(res2, res3));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().trim().split(",");
        BloodSimilarity solver = new BloodSimilarity();
        int res = solver.bloodSimilarity(strs[0], strs[1]);
        System.out.print(res);
    }
}

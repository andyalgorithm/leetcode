package stack_queue;

/**
 * 921. 使括号有效的最少添加
 */


public class MinAddMakeValid {

    int minAddMakeValid(String s) {
        int left=0, need=0;
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c=='(') {
                left++;
            } else {
                left--;
            }

            if(left<0) {
                left=0;
                need++;
            }
        }

        return left+need;

    }
}

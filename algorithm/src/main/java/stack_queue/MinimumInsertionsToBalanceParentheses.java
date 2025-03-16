package stack_queue;

import java.util.Queue;
import java.util.Stack;

/**
 * 1541. 平衡括号字符串的最少插入次数
 */
public class MinimumInsertionsToBalanceParentheses {


//    方法1
    public int minInsert(String s){
        int res=0, need=0;

        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c=='(') {
                need+=2;
                // 右括号为奇数，说明还需要添加一个右括号，让其为偶数，那么现在还需要need-1个右括号
                if (need % 2 == 1) {
                    res++;
                    need--;
                }
            } else {
                need--;
                if(need==-1) {
                    // 需要一个左括号时，那么添加一个左括号后，右括号还需要一个
                    res++;
                    need=1;
                }
            }
        }

        return need+res;
    }

}

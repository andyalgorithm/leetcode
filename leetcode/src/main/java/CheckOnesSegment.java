import java.util.Stack;

/**
 * 1784. 检查二进制字符串字段
 */

public class CheckOnesSegment {
    public boolean checkOnesSegment(String s) {
        boolean res = true;
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(c);
            }else{
                if(stack.peek()==c){
                    continue;
                }else if(stack.size()==1){
                    stack.push(c);
                }else if(stack.size()>1 && stack.peek()!=c){
                    return false;
                }
            }
        }

        return res;
    }

}

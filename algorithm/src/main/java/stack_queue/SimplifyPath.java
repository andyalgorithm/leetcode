package stack_queue;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.Stack;

/**
 * 71. 简化路径。因为有回退操作，所以需要使用栈
 */

public class SimplifyPath {

    public String simplifyPath(String path) {
        String res = "";
        String[] parts = path.split("/");
        Stack<String> stack = new Stack<>();
        for(String part: parts) {
            if(part.isEmpty() || part.equals(".")) {
                continue;
            }
            if(part.equals("..")) {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
                continue;

            } else {
                stack.push(part);
            }
        }

        while (!stack.isEmpty()) {
            res = "/"+stack.pop()+res;
        }

        if(res.equals("")) {
            res = "/";
        }

        return res;
    }
}

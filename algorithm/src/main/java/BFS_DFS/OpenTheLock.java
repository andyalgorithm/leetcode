package BFS_DFS;

import java.util.*;

/**
 * 752. 打开转盘锁
 */

public class OpenTheLock {

    public int openTheLock(ArrayList<String> depends, String target) {
        int res = 0;
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>(depends);
        queue.add("0000");

        while (!queue.isEmpty()) {
            int sz = queue.size();

            for(int i=0; i<sz; i++) {
                String cur = queue.poll();
//                System.out.println(sz);
                if(visited.contains(cur)) {
                    continue;
                } else {
                    visited.add(cur);
                }

                if(target.equals(cur)) {
                    return res;
                }
//                assert cur != null;
                for(int m = 0; m<cur.length(); m++) {
                    String sMinus = minusOne(cur, m);
                    String sPlus = plusOne(cur, m);
                    queue.add(sMinus);
                    queue.add(sPlus);
                }
            }
            res += 1;
        }

        return -1;
    }

    // 将s[i] 向下拨动一位
    String minusOne(String s, int i) {
        char[] ch = s.toCharArray();
        if(ch[i]=='0') {
            ch[i] = '9';
        } else {
            ch[i] -= 1;
        }
        return new String(ch);
    }

    // 将s[i] 向上拨动一位
    String plusOne(String s, int i) {
        char[] ch = s.toCharArray();
        if(ch[i]=='9') {
            ch[i] = '0';
        } else {
            ch[i] += 1;
        }
        return new String(ch);
    }



}

package BFS_DFS;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 *  773. 滑动谜题
 */

public class SlidingPuzzle {

    public int slidingPuzzle(int[][] nums) {
        int res = 0;
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        String target = "123450";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<nums.length; i++) {
            for(int j=0;j<nums[0].length;j++) {
                sb.append(nums[i][j]);
            }
        }

        queue.add(sb.toString());
        while(!queue.isEmpty()) {
            int sz = queue.size();

            for(int i=0; i< sz; i++) {
                String cur = queue.poll();

                if(visited.contains(cur)) {
                    continue;
                } else {
                    visited.add(cur);
                }

                if(cur.equals(target)) {
                    return res;
                }

                // 遍历得到'0'的索引
                int index = 0;
                for(;index<cur.length(); index+=1) {
                    if(cur.charAt(index)=='0') {
                        break;
                    }
                }

                int row = index/nums[0].length;
                int col = index%nums[0].length;

                // 左交换
                if(col>0) {
                    String sLeft = swap(cur, index, index-1);
                    queue.add(sLeft);
                }
                // 右交换
                if(col<nums[0].length-1) {
                    String sRight = swap(cur, index, index+1);
                    queue.add(sRight);
                }

                // 上交换
                if(row>0) {
                    String sTop = swap(cur, index, index-nums[0].length);
                    queue.add(sTop);
                }

                // 下交换
                if(row<nums.length-1) {
                    String sBottom = swap(cur, index, index+nums[0].length);
                    queue.add(sBottom);
                }

            }

            res += 1;
        }

        return -1;


    }

    String swap(String s, int i, int j) {
//        System.out.println(s+" "+i+" "+j);
        char[] ch = s.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return new String(ch);

    }
}

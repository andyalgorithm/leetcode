package dataStructureDesign;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 *  895 最大频率栈
 */


public class MaximumFrequencyStack {

    // 当前最大频率
    int maxFre = 0;

    // 数值与频率的映射表
    HashMap<Integer, Integer> valToFre = new HashMap<>();
    // 频率与数值的映射表
    HashMap<Integer, Stack<Integer>> freToVal = new HashMap<Integer, Stack<Integer>>();


    public void push(int val) {
        // 修改 VF 表：val 对应的 freq 加⼀
        int fre = valToFre.getOrDefault(val, 0) + 1;
        valToFre.put(val, fre);
        // 修改 FV 表：在 freq 对应的列表加上 val
        freToVal.putIfAbsent(fre, new Stack<>());
        freToVal.get(fre).push(val);
        // 更新 maxFreq
        maxFre = Math.max(maxFre, fre);

    }

    public int pop() {
        Stack<Integer> vals = freToVal.get(maxFre);
        int v = vals.pop();
        valToFre.replace(v, maxFre-1);
        if(vals.isEmpty()) {
            maxFre--;
            freToVal.remove(maxFre);
        }
        return v;
    }

}



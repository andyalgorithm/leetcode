import java.util.*;

/**
 * 1087. 花括号展开
 */

public class Expand {
    public String[] expand(String s) {

        List<List<Character>> temp = new ArrayList<>();
        decode(s, temp);
        List<String> resList = new ArrayList<>();
        backtrack(0, temp, new StringBuilder(),resList);
        String[] res = new String[resList.size()];
        for(int i=0; i<resList.size(); i++){
            res[i] = resList.get(i);
        }
        return res;
    }

    void decode(String s, List<List<Character>> temp){
        boolean left = false;
        Queue<Character> queue = new PriorityQueue<>(
                (a, b) -> {
                    return a-b;
                }
        );
        for(char c: s.toCharArray()){
            if(c == '{'){
                left = true;
            }else if(c == '}'){
                List<Character> t = new ArrayList<>();
                while (!queue.isEmpty()){
                    t.add(queue.poll());
                }
                temp.add(t);
                left = false;
            }else if(c == ','){
                continue;
            }else {

                if (left) {
                    // 形如{a,b}c{d,e}中的a,b和d,e
                    queue.add(c);
                }else{
                    // 形如{a,b}c{d,e}中的c
                    List<Character> t = new ArrayList<>();
                    t.add(c);
                    temp.add(t);
                }
            }
        }
    }

    void backtrack(int start, List<List<Character>> temp, StringBuilder s, List<String> res){
        if(start>temp.size()){
            return;
        }else if(start==temp.size()){
            res.add(new String(s));
            return;
        }
        for(char c: temp.get(start)){
            s.append(c);
            backtrack(start+1, temp, s, res);
            s.deleteCharAt(s.length()-1);
        }

    }
}

package dataStructureDesign;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/**
 *  380 O(1)时间插入、删除、获取随机元素
 */

public class InsertDeleteGetRandom {

    ArrayList<Integer> data = new ArrayList<>();

    boolean insert(int val) {
        if(data.contains(val)) {
            return false;
        }else {
            data.add(val);
            return true;
        }
    }

    boolean remove(int val) {
        if(data.contains(val)) {
            // 若不转换成对象，那么默认按照索引删除
            data.remove((Integer) val);
            return true;
        }else {
            return false;
        }
    }

    int getRandom() {
        int index = new Random().nextInt()%data.size();
        return data.get(index);
    }
}

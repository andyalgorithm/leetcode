package dataStructureDesign;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *  341 扁平化嵌套列表迭代器
 */

class NestedInteger {
    Integer val;
    LinkedList<NestedInteger> list;

    public NestedInteger(int val) {
        this.val = val;
        this.list = null;
    }

    public NestedInteger(LinkedList<NestedInteger> list) {
        this.val = null;
        this.list = list;
    }

    // 判断是否存储的是一个整数
    boolean isInteger() {
        return val!=null;
    }

    // 是否是链表
    boolean isList() {
        return list!=null;
    }

    Integer getInteger() {
        return val;
    }

    LinkedList<NestedInteger> getList() {
        return list;
    }
}

public class FlattenNestedListIterator implements Iterator<Integer> {

    LinkedList<NestedInteger> list;

    public FlattenNestedListIterator(LinkedList<NestedInteger> nestList) {
        list = nestList;
    }

    @Override
    public boolean hasNext() {
        while(!list.isEmpty() && list.get(0).isList()) {
            LinkedList<NestedInteger> temp = list.get(0).getList();
            list.remove(0);
            for(int i=temp.size()-1; i>=0; i--) {
                list.addFirst(temp.get(0));
            }
        }
        return list.size()>0;
    }

    @Override
    public Integer next() {
        return list.remove(0).getInteger();
    }
}

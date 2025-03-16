package alibaba;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadPrintABC2 {
    int size;
    int state;
    int count;

    ReentrantLock lock = new ReentrantLock();

    public ThreadPrintABC2(int size, int group) {
        this.size = size;
        this.count = size*group;
    }

    public void printABC(String s, int nums, int val) {
        while(state<count) {
            lock.lock();
            if(state%size==val && state<count) {
                for(int i=0;i<nums; i++) {
                    System.out.print(s);
                }
                state++;
                if(state%size==0) {
                    System.out.println();
                }
            }
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ThreadPrintABC2 p = new ThreadPrintABC2(3, 10);

        new Thread(() -> {
            p.printABC("AA", 1, 0);
        }).start();

        new Thread(() -> {
            p.printABC("BB", 2, 1);
        }).start();

        new Thread(() -> {
            p.printABC("CC", 3, 2);
        }).start();
    }
}

package alibaba;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadPrintNums {
    int size;
    int state;
    ReentrantLock lock = new ReentrantLock();

    public ThreadPrintNums(int nums) {
        this.size = size;
    }

    void printNum(int val) {
        while (state <= 100) {
            lock.lock();
            if(state<=100 && state%2==val) {
                System.out.println(state);
                state += 1;
            }
            lock.unlock();
        }
    }


    public static void main(String[] args) {
        ThreadPrintNums p = new ThreadPrintNums(100);

        // 打印奇数
        new Thread(
                () -> {
                    p.printNum(0);
                }
        ).start();

        // 打印偶数
        new Thread(
                () -> {
                    p.printNum(1);
                }
        ).start();


    }
}


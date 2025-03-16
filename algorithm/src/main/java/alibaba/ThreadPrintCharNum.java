package alibaba;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadPrintCharNum {
    int size;
    int count;
    int state;
    int n=1;
    char c = 'A';
    ReentrantLock lock = new ReentrantLock();

    public ThreadPrintCharNum(int size, int group) {
        this.size = size;
        this.count = size*group;
    }

    public void printNum(int val) {
        while (state<count) {
            lock.lock();
            if(state<count && state%size==val) {
                System.out.print(n);
                state++;
                n+=1;
            }
            lock.unlock();
        }
    }

    public void printChar(int val) {
        while(state<count) {
            lock.lock();
            if(state<count &&state%size==val) {
                System.out.print(c);
                c+=1;
                state++;
            }
            lock.unlock();
        }
    }

    public static void main(String[] args) {

        ThreadPrintCharNum p = new ThreadPrintCharNum(2, 26);

        new Thread(() ->
                p.printNum(0)
        ).start();


        new Thread(() -> {
            p.printChar(1);
        }).start();

    }
}

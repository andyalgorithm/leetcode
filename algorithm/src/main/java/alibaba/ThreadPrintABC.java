package alibaba;

import java.util.concurrent.locks.ReentrantLock;


public class ThreadPrintABC {
    int state = 0;
    int line = 10;
    int size = 3;
    ReentrantLock lock = new ReentrantLock();

    public ThreadPrintABC(int size, int line) {
        this.size = size;
        this.line = line;
    }

    public void printABC(String s, int num) {
        while(true) {
            lock.lock();
            if (state%size == num) {
                System.out.print(s);
                state+=1;
                if(state%line==0) {
                    System.out.println();
                }else if(state%size==0) {
                    System.out.print(" ");
                }
            }
            lock.unlock();
        }
    }


    public static void main(String[] args) {
        ThreadPrintABC p = new ThreadPrintABC(3, 30);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                p.printABC("A", 0);
            }
        });

        Thread thread2 = new Thread(() -> {
            p.printABC("B", 1);
        });

        Thread thread3 = new Thread(() -> {
            p.printABC("C", 2);
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
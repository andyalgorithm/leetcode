package multiThread;




import org.apache.commons.lang3.time.StopWatch;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 1114 按序打印
 * 使用可重入锁 ReentrantLock
 */



public class PrintInOrder {

    int state = 0;
    ReentrantLock lock = new ReentrantLock();


    public PrintInOrder() {
    }

    public Runnable printFirst() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.print("first");
            }
        };
    }

    public Runnable printSecond() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.print("second");
            }
        };
    }

    public Runnable printThird() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.print("third");
            }
        };
    }

    public void first(Runnable printFirst) {
        lock.lock();
        printFirst.run();
        state++;
        lock.unlock();

    }

    public void second(Runnable printSecond) {
        while(state!=1) {}
        lock.lock();
        printSecond.run();
        state++;
        lock.unlock();
    }



    public void third(Runnable printThird) {
        while (state != 2) {}
        lock.lock();
        printThird.run();
        state++;
        lock.unlock();
    }


    public static void main(String[] args) throws InterruptedException {
        PrintInOrder foo = new PrintInOrder();

        Thread thread1 =  new Thread(() -> {
            foo.first(foo.printFirst());
        });

        Thread thread2 = new Thread(() -> {
            foo.second(foo.printSecond());
        });

        Thread thread3 = new Thread(() -> {
            foo.third(foo.printThird());
        });

        // 使用apache.commons的SopWatch计算程序耗时
        StopWatch watch = new StopWatch();
        watch.start();

        thread1.start();
        thread2.start();
        thread3.start();

        // 让程序依次执行完成
        thread1.join();
        thread2.join();
        thread3.join();

        watch.stop();
        System.out.println("cost time: "+ watch.getTime()+"ms"); // 6ms




    }
}
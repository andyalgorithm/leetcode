package multiThread;

import org.apache.commons.lang3.time.StopWatch;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 1114 按序打印
 *
 * 使用synchronized锁
 */



public class PrintInOrder3 {

    AtomicInteger state = new AtomicInteger(0);
//    ReentrantLock lock = new ReentrantLock();


    public PrintInOrder3() {
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
            printFirst.run();
            state.incrementAndGet();

    }

    public void second(Runnable printSecond) {
        while(state.get()!=1) {}
        printSecond.run();
        state.incrementAndGet();
    }



    public void third(Runnable printThird) {
        while (state.get() != 2) {}
        printThird.run();
        state.incrementAndGet();
    }


    public static void main(String[] args) throws InterruptedException {
        PrintInOrder3 foo = new PrintInOrder3();

        Thread thread1 =  new Thread(() -> {
            foo.first(foo.printFirst());
        });

        Thread thread2 = new Thread(() -> {
            foo.second(foo.printSecond());
        });

        Thread thread3 = new Thread(() -> {
            foo.third(foo.printThird());
        });
        StopWatch watch = new StopWatch();
        watch.start();

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        watch.stop();
        System.out.println("cost time: "+watch.getTime()+"ms"); // 7ms
    }
}
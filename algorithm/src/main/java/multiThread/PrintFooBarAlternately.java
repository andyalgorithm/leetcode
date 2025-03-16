package multiThread;

import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

/**
 *  1115 交替打印FooBar
 */

public class PrintFooBarAlternately {

    private int n;
    ReentrantLock lock = new ReentrantLock();
    int state=0;

    public PrintFooBarAlternately(int n) {
        this.n = n;
    }

    public Runnable printFoo() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.print("foo");
            }
        };
    }

    public Runnable printBar() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.print("bar");
            }
        };
    }

    public void foo(Runnable printFoo) {
        for(int i=0;i<n;i++) {
            lock.lock();
            if(state%2==0) {
                printFoo.run();
                state++;
            }else{
                i--;
            }
            lock.unlock();
        }
    }

    public void bar(Runnable printBar) {
        for(int i=0;i<n;i++) {
            lock.lock();
            if(state%2==1) {
                printBar.run();
                state++;
            }else {
                i--;
            }
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        PrintFooBarAlternately print = new PrintFooBarAlternately(n);

        new Thread(() -> {
            print.foo(print.printFoo());
        }).start();

        new Thread(() -> {
            print.bar(print.printBar());
        }).start();

    }
}

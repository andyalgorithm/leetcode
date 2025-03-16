package multiThread;

import java.util.Scanner;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * 1195 交替打印字符串
 */


class IntConsumer{
    public void accept(int x) {
        System.out.print(x);
    }
}

public class FizzBuzzII {
    int n;
    int state=1;
    CyclicBarrier cb = new CyclicBarrier(4);

    public FizzBuzzII(int n) {
        this.n = n;
    }

    public void fizz(Runnable printFizz) throws InterruptedException, BrokenBarrierException {
        for(int i=1; i<=n; i++) {
            if(i%3==0 && i%5!=0) {
                printFizz.run();
            }
            cb.await();
        }
    }

    public void buzz(Runnable printBuzz) throws InterruptedException, BrokenBarrierException {
        for(int i=1;i<=n;i++) {
            if(i%3!=0 && i%5==0) {
                printBuzz.run();
            }
            cb.await();
        }
    }

    public void fizzBuzz(Runnable printFizzBuzz) throws InterruptedException, BrokenBarrierException {
        for(int i=1;i<=n;i++) {
            if(i%15==0) {
                printFizzBuzz.run();
            }
            cb.await();
        }
    }

    public void number(IntConsumer printNumber) throws InterruptedException, BrokenBarrierException {
        for(int i=1; i<=n; i++) {
            if(i%3!=0 && i%5!=0) {
                if(i!=1) {
                    System.out.print(",");
                }
                printNumber.accept(i);
            }
            cb.await();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        FizzBuzzII obj = new FizzBuzzII(n);

        new Thread(() ->{
            try {
                obj.fizz(new Runnable() {
                    @Override
                    public void run() {
                        System.out.print(",fizz");
                    }
                });
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                obj.buzz(new Runnable() {
                    @Override
                    public void run() {
                        System.out.print(",buzz");
                    }
                });
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }).start();


        new Thread(() -> {
            try {
                obj.fizzBuzz(new Runnable() {
                    @Override
                    public void run() {
                        System.out.print(",fizzbuzz");
                    }
                });
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                obj.number(new IntConsumer());
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }).start();

    }



}

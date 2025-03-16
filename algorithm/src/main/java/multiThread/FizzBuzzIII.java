package multiThread;

import java.util.Scanner;
import java.util.concurrent.Semaphore;



/**
 * 1195 交替打印字符串
 */

public class FizzBuzzIII {
    int n;
    public Semaphore number = new Semaphore(1);
    public Semaphore fizz = new Semaphore(0);
    public Semaphore buzz = new Semaphore(0);
    public Semaphore fizzBuzz = new Semaphore(0);

    public FizzBuzzIII(int n) {
        this.n = n;
    }

    public void printFizz() throws InterruptedException {
        for(int i=1; i<=n; i++) {
            fizz.acquire();
            if(i%3==0 && i%5!=0) {
                System.out.print("fizz ");
            }
            buzz.release();
        }
    }

    public void printBuzz() throws InterruptedException {
        for(int i=1; i<=n; i++) {
            buzz.acquire();
            if(i%3!=0 && i%5==0) {
                System.out.print("buzz ");
            }
            fizzBuzz.release();
        }
    }

    public void printFizzBuzz() throws InterruptedException {
        for(int i=1; i<=n;i++) {
            fizzBuzz.acquire();
            if(i%15==0) {
                System.out.print("fizzbuzz ");
            }
            number.release();
        }
    }

    public void printNumber() throws InterruptedException {
        for(int i=1;i<=n;i++) {
            number.acquire();
            if(i%3!=0 && i%5!=0) {
                System.out.print(i+" ");
            }
            fizz.release();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        FizzBuzzIII obj = new FizzBuzzIII(n);

        new Thread(() -> {
            try {
                obj.printBuzz();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                obj.printFizz();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                obj.printFizzBuzz();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                obj.printNumber();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();



    }
}

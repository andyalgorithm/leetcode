package multiThread;

import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 1195 交替打印字符串
 */

public class FizzBuzz {
    int order=0; // fizzbuzz=0, fizz=1, buzz=2, number=3;
    ReentrantLock lock = new ReentrantLock();
    int state=1;
    int count;


    public FizzBuzz(int n) {
        count = n;
    }

    public void fizzbuzz() {
        while(state<=count) {
            lock.lock();
            if(state<=count && order==0 && state%15==0) {
                System.out.print(",fizzbuzz");
                state++;
                order=0;
            }else {
                order = 1;
            }
            lock.unlock();
        }
    }

    public void fizz() {
        while(state<=count) {
            lock.lock();
            if(state<=count && order==1 && state%3==0) {
                System.out.print(",fizz");
                state++;
                order=0;
            }else {
                order = 2;
            }
            lock.unlock();
        }
    }

    public void buzz() {
        while(state<=count) {
            lock.lock();
            if(state<=count && order==2 && state%5==0) {
                System.out.print(",buzz");
                state++;
                order=0;
            }else {
                order = 3;
            }
            lock.unlock();
        }
    }

    public void number() {
        while(state<=count) {
            lock.lock();
            if(state<=count && order==3 && state%3!=0 && state%5!=0) {
                if(state==1){
                    System.out.print(state);
                }else {
                    System.out.print(","+state);
                }
                state++;

            }
            order=0;
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        FizzBuzz obj = new FizzBuzz(n);

        new Thread(obj::fizzbuzz).start();
        new Thread(obj::fizz).start();
        new Thread(obj::buzz).start();
        new Thread(obj::number).start();
    }

}

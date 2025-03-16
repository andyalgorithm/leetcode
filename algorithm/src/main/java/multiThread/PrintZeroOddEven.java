package multiThread;

import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

/**
 *  1115 打印零和奇偶数
 */

public class PrintZeroOddEven {
    private int n;
    int state=1;
    boolean zeroState=true;
    ReentrantLock lock = new ReentrantLock();

    public PrintZeroOddEven(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero() {
        while(state<=2*n) {
            lock.lock();
            if(state<=2*n && zeroState) {
                System.out.print(0);
                zeroState=false;
            }
            lock.unlock();
        }
    }

    public void even() {
        while(state<=2*n) {
            lock.lock();
            if(state<=2*n && !zeroState && state%2==0) {
                System.out.print(state);
                zeroState=true;
                state++;
            }
            lock.unlock();
        }
    }

    public void odd(){
        while(state<=2*n) {
            lock.lock();
            if(state<=2*n && !zeroState && state%2==1) {
                System.out.print(state);
                zeroState=true;
                state++;
            }
            lock.unlock();
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        PrintZeroOddEven obj = new PrintZeroOddEven(n);
        new Thread(obj::zero).start();

        new Thread(obj::odd).start();

        new Thread(obj::even).start();

    }
}

package multiThread;

import java.util.concurrent.locks.ReentrantLock;

public class ProduceH2O {

    String water;
    int state=0;
    ReentrantLock lock = new ReentrantLock();

    public ProduceH2O(String water) {
        this.water = water;
    }

    public void hydrogen() {
        while(state<water.length()) {
            lock.lock();

            lock.unlock();
        }
    }

    public void oxygen() {

    }

    public static void main(String[] args) {

    }
}

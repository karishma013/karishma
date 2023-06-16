package Backend.src.Multithreading;

public class Deadlock {

    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    public static void deadlock() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lock2) {

                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock2) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lock1) {

                    }
                }
            }
        });

        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
        deadlock();
    }
}
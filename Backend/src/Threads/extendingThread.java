package Backend.src.Threads;

public class extendingThread extends Thread {


    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        extendingThread thread = new extendingThread();
        thread.start();
    }
}
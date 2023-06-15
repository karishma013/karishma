package Backend.src.Threads;

public class runnableInterface implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Runnable obj = new runnableInterface();
        Thread thread = new Thread(obj);
        thread.start();
    }
}

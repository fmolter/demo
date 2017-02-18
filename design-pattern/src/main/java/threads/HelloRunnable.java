package threads;

/**
 * Created by felix on 14.02.17.
 */
public class HelloRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from my Thread!");
    }

    public static void main(String[] args) {
        new Thread(new HelloRunnable()).start();
    }
}

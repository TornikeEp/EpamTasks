import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    Task - make synchronized counter.
 */
class Counter implements Runnable {

    private static int counter = 0;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executorService.submit(new Counter());
        }
        executorService.shutdown();
    }

    @Override
    public void run() {
        while (counter < 1000) {
            increment();
        }
    }

    private synchronized void increment() {
        System.out.println(Thread.currentThread().getName() + "counter: " + counter);
        counter++;
    }
}
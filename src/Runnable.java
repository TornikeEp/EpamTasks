public interface Runnable {
    default void run() {
        System.out.println("Running runnable");
    }
}

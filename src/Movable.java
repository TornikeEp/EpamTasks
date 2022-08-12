public interface Movable {
    default void run() {
        System.out.println("Running movable");
    }
}

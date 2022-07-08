public class Test implements Movable, Runnable{

    // To call default method with same signature in both interfaces, we must override it.
    @Override
    public void run() {
        Movable.super.run();
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.run(); //Running movable
    }
}

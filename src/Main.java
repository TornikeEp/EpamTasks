//Using nested classes
public class Main{
    public static void main(String[] args) {

        Computer computer = new Computer("Hp");

        //Create an object of inner class
        //The name of the class file for Screen will be Computer$Screen.class.
        Computer.Screen screen = computer.new Screen();

        //Create an object of static inner class
        //The name of the class file for Screen will be Computer$Keyboard.class.
        Computer.Keyboard keyboard = new Computer.Keyboard();

        //Create an object of anonymous inner class
        //The name of the class file for anonymous class will be Main$1.class
        Movable movable = new Movable() {
            @Override
            public void move() {
                System.out.println("Running anonymous class");
            }
        };
        movable.move();
    }
}
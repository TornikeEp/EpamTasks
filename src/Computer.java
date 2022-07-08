
public class Computer {

    private String name;

    public Computer(String name){
        this.name = name;
    }

    public class Screen {
        public Screen() {
            System.out.println("Computer: " + name);
        }
    }

    static class Keyboard{
        public Keyboard(){
            System.out.println("Keyboard static class");
        }
    }
}

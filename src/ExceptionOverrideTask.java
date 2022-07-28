import java.io.IOException;

public class ExceptionOverrideTask {

    /*
        Task - override methods with exceptions in child class.
     */
    public static void main(String[] args) {
        Employee manager = new Manager("Tornike", 21);
        try {
            manager.setAddressFromFile("");
        } catch (IOException exception) {
            System.out.println(exception);
        }
        manager.setAge(20);
    }
}

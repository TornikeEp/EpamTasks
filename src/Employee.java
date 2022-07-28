import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Employee {

    private int age;
    private String name;
    private String address;

    /*
        Throwing unchecked exception and after catching it object is still created.
     */
    public Employee(int age, String name, String address) {
        try {
            if (age < 18) {
                throw new IllegalArgumentException("Age is not valid");
            } else {
                this.age = age;
            }
        } catch (IllegalArgumentException exception) {
            System.out.println(exception);
        }
        this.address = address;
        this.name = name;
    }

    /*
        Catching checked exception. Object will be created.
     */
    public Employee(int age, String filePath) {
        String name = "";
        try (Scanner scanner = new Scanner(new File(filePath))) {
            if (scanner.hasNext()) name = scanner.next();
            this.name = name;
        } catch (FileNotFoundException exception) {
            System.out.println(exception);
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Manager extends Employee {

    private int age;
    private String address;

    public Manager(String name, int age) {
        super(name, age);
    }

    @Override
    public void setAge(int age) throws RuntimeException {
        if (age < 22) {
            throw new RuntimeException();
        } else {
            this.age = age;
        }
    }

    @Override
    public void setAddressFromFile(String filePath) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File(filePath))) {
            if (scanner.hasNext()) {
                this.address = "Tbilisi " + scanner.next();
            }
        }
    }
}

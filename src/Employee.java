import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Employee {

    private String name;
    private int age;
    private String address;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) throws IllegalArgumentException {
        if(age < 18) {
            throw new IllegalArgumentException("Age is not valid");
        } else {
            this.age = age;
        }
    }

    public void setAddressFromFile(String filePath) throws IOException {
        try (Scanner scanner = new Scanner(new File(filePath))) {
            if (scanner.hasNext()){
                this.name = scanner.next();
            }
        }
    }
}

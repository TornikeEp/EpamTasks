import java.util.ArrayList;
import java.util.List;

public final class ImmutableEmployee {

    private final String empName;
    private final int age;
    private final Address address;
    private final List<Responsibility> responsibilities;

    public ImmutableEmployee(String empName, int age, Address address, List<Responsibility> responsibilities) {
        this.empName = empName;
        this.age = age;
        this.address = address;
        this.responsibilities = responsibilities;
    }

    public String getEmpName() {
        return empName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return new Address(address);
    }

    public List<Responsibility> getResponsibilities() {
        List<Responsibility> clonedResponsibilities = new ArrayList<>();
        for (Responsibility responsibility : responsibilities) {
            Responsibility clonedResponsibility = new Responsibility(responsibility);
            clonedResponsibilities.add(clonedResponsibility);
        }
        return clonedResponsibilities;
    }

    @Override
    public String toString() {
        return "ImmutableEmployee{" +
                "empName='" + empName + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", responsibilities=" + responsibilities +
                '}';
    }
}

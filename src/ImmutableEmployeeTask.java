import java.util.ArrayList;
import java.util.List;

public class ImmutableEmployeeTask {

    /*
        Task - make ImmutableEmployee immutable.
     */
    public static void main(String[] args) {

        List<Responsibility> list = new ArrayList<>();
        list.add(new Responsibility("count"));
        list.add(new Responsibility("check"));
        ImmutableEmployee immutableEmployee = new ImmutableEmployee("Tornike",
                20, new Address("England", "Baker street"), list);
        System.out.println(immutableEmployee);
        Address address = immutableEmployee.getAddress();
        address.setCountry("Georgia");
        List<Responsibility> responsibilities = immutableEmployee.getResponsibilities();
        responsibilities.add(new Responsibility("run"));
        System.out.println(immutableEmployee);
    }
}

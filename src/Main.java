import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
    Task: Create different comparators for the class, add objects in treeset
    and modify fields while iterating.
 */
public class Main {

    /*
        ConcurrentModificationException will be thrown if we try to add
        remove or replace element while we are iterating set.
     */
    public static void main(String[] args) {
        Main main = new Main();
        Set<Employee> set = new TreeSet<>(new EmployeeNameComparator());
        Set<Employee> set2 = new TreeSet<>(new EmployeeNameAndSalaryComparator());
        main.addElements(set);
        main.changeSalary(set);
        main.addElements(set2);
        main.changeSalary(set2);
        main.changeName(set2);
    }

    public void addElements(Set<Employee> set) {
        set.add(new Employee("David", 1000));
        set.add(new Employee("Tom", 1500));
        set.add(new Employee("George", 2000));
        set.add(new Employee("Bob", 3000));
    }

    public void changeSalary(Set<Employee> set) {
        Iterator<Employee> iterator = set.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            employee.setSalary(2 * employee.getSalary());
            System.out.println(employee);
        }
    }

    public void changeName(Set<Employee> set) {
        Iterator<Employee> iterator = set.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            employee.setName(employee.getName() + " junior");
            System.out.println(employee);
        }
    }
}

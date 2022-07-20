import java.util.Comparator;

public class EmployeeNameAndSalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int nameComparisonResult = o1.getName().compareTo(o2.getName());
        if (nameComparisonResult != 0) return nameComparisonResult;
        return o1.getSalary() - o2.getSalary();
    }
}

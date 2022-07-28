public class ConstructorExceptionTask {

    /*
        Task - throw exception in constructor and find out if object still will
        be created.
     */
    public static void main(String[] args) {
        Employee employee = new Employee(25, "");
        System.out.println(employee);
        Employee employee2 = new Employee(14, "Tornike", "Tbilisi");
        System.out.println(employee2);
    }
}

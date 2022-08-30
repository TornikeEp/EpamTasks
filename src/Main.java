// Task is about to check how many objects will be created when we have hierarchy of classes.
// ClassA -> ClassB -> ClassC -> ClassD -> ClassE
public class Main {
    public static void main(String[] args) {
        // Only object of ClassA is created
        ClassA classA = new ClassA();

        // Constructors of ClassA, ClassB and ClassC were called
        ClassC classC = new ClassC();

        // Constructors were called of each parent class of parent classes
        // because object of ClassE is created.
        ClassA testClass = new ClassE();

        // Constructors were called of each parent class of parent classes
        ClassD classE = new ClassE();
    }
}

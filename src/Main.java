/*
    Implemented hierarchy of sealed classes.
    Animal -> Cat -> (Lion, Tiger)
    All classes are sealed, except of the Lion, which is a final class.
 */
public class Main {

    public static void main(String[] args) {
        Animal animalCat = new Cat("George", 12);
        Animal animalTiger = new Tiger("David", 4);

        // Overrided methods are executed
        animalCat.run();
        animalTiger.run();

        // Only object of the Lion is created, differs from non-sealed classes.
        Lion lion = new Lion("James", 7);

        //Sealed classes behaves as regular classes and throws exception.
        try{
            Tiger tiger = (Tiger) new Cat("Tom", 6);
        } catch (ClassCastException e){
            System.out.println(e.toString());
        }

        // Same behavior when we have a final class.
        try{
            Lion lionTom = (Lion) new Cat("Tom", 6);
        } catch (ClassCastException e){
            System.out.println(e.toString());
        }
    }
}

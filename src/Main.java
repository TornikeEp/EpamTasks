import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
    Add strings in TreeSet which are compared with second letter.
 */
public class Main {

    // Will be printed: Null, David, Abraham, George, Tornike
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>(new StringComparator());
        treeSet.add("Tornike");
        treeSet.add("George");
        treeSet.add("David");
        treeSet.add(null);
        treeSet.add(null);
        treeSet.add("Abraham");
        Iterator iterator = treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

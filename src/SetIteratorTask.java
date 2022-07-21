import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/*
    The task was to iterate hashset and concurrent set with iterator and
    while iterating add elements in the set.
 */
public class SetIteratorTask {

    public static void main(String[] args) {
        SetIteratorTask main = new SetIteratorTask();
        Set<String> hashSet = new HashSet<>();
        Set<String> concurrentSet = ConcurrentHashMap.newKeySet();
        main.addElements(hashSet);
        main.addElements(concurrentSet);
        main.iterateSet(hashSet);
        main.iterateSet(concurrentSet);
    }

    public void addElements(Set<String> set) {
        set.add("Tornike");
        set.add("David");
        set.add("Tom");
        set.add("Max");
    }

    public void iterateSet(Set<String> set) {
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            try {
                System.out.println(iterator.next());
            } catch (ConcurrentModificationException c) {
                System.out.println(c);
                break;
            }
            set.add("Michael");
        }
    }
}

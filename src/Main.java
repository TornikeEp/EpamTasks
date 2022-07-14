import java.util.*;

/*
    Sort list with descending order
 */
public class Main {

    // Will be printed: Tornike, Nick, Magda, David, Bob
    public static void main(String[] args) {
        List<String> list = new LinkedList<>(Arrays.asList("Tornike", "David", "Nick", "Magda", "Bob"));
        Collections.sort(list, Collections.reverseOrder());
        Iterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

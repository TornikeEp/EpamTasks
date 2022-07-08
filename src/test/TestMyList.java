package test;

import main.MyList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMyList {

    private MyList<String> myList;

    @BeforeEach
    void setup(){
        myList = new MyList<>();
    }

    @Test
    void testAdd(){
        Assertions.assertEquals(0, myList.size());
        myList.add("Tom");
        Assertions.assertEquals(1, myList.size());
        myList.add("David");
        Assertions.assertEquals(2, myList.size());
        myList.add("Peter");
        Assertions.assertEquals(3, myList.size());
    }

    @Test
    void testGet() {
        for (int i = 0; i < 100; i++) {
            myList.add(Integer.toString(i));
        }
        for (int i = 0; i < 100; i++) {
            Assertions.assertEquals(Integer.toString(i), myList.get(i));
        }
    }

    @Test
    void testOutboundedGet(){
        Assertions.assertThrows(IndexOutOfBoundsException.class , ()-> {
            myList.get(0);
        });
        Assertions.assertThrows(IndexOutOfBoundsException.class , ()-> {
            myList.get(1);
        });
        myList.add("Tom");
        myList.add("David");
        Assertions.assertThrows(IndexOutOfBoundsException.class , ()-> {
            myList.get(2);
        });
        Assertions.assertThrows(IndexOutOfBoundsException.class , ()-> {
            myList.get(3);
        });
    }

    @Test
    void testEmptyRemove(){
        Assertions.assertThrows(IndexOutOfBoundsException.class , ()-> {
            myList.remove(0);
        });
        Assertions.assertThrows(IndexOutOfBoundsException.class , ()-> {
            myList.remove(1);
        });
    }

    @Test
    void testRemoveOdds(){
        for (int i = 0; i < 100; i++) {
            myList.add(Integer.toString(i));
        }
        for(int i = 99; i >= 0; i = i -2){
            myList.remove(i);
        }
        for(int i = 0; i < 50; i++){
            Assertions.assertEquals(Integer.toString(2  * i), myList.get(i));
        }
    }

    @Test
    void testUoutboundedSet(){
        Assertions.assertThrows(IndexOutOfBoundsException.class , ()-> {
            myList.set(0, "0");
        });
        myList.add("Cake");
        Assertions.assertThrows(IndexOutOfBoundsException.class , ()-> {
            myList.set(1, "0");
        });
    }

    @Test
    void testSet(){
        for(int i = 0; i < 100; i++){
            myList.add(Integer.toString(i));
        }
        for(int i = 0; i < 100; i++){
            Assertions.assertEquals(Integer.toString(i), myList.set(i, "-1"));
        }
        for(int i = 0; i < 100; i++){
            Assertions.assertEquals("-1", myList.get(i));
        }
    }

    @Test
    void testAddAtIndex(){
        myList.add(0,"Tom");
        myList.add(1, "David");
        myList.add(1, "George");
        myList.add(0, "Peter");
        myList.add(4, "Paul");
        myList.add(4, "Luke");
        Assertions.assertEquals(6, myList.size());
        Assertions.assertEquals("Peter", myList.get(0));
        Assertions.assertEquals("Tom", myList.get(1));
        Assertions.assertEquals("George", myList.get(2));
        Assertions.assertEquals("David", myList.get(3));
        Assertions.assertEquals("Luke", myList.get(4));
        Assertions.assertEquals("Paul", myList.get(5));
    }

    @Test
    void testAddAtWrongIndex(){
        Assertions.assertThrows(IndexOutOfBoundsException.class , ()-> {
            myList.add(1, "0");
        });
        Assertions.assertThrows(IndexOutOfBoundsException.class , ()-> {
            myList.add(2, "0");
        });
        myList.add("Tom");
        myList.add("David");
        Assertions.assertThrows(IndexOutOfBoundsException.class , ()-> {
            myList.add(3, "0");
        });
    }
}

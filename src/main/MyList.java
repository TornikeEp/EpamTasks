package main;

import java.util.AbstractList;

// Task is about to implement our list with AbstractList
public class MyList <T> extends AbstractList<T> {

    private Object[] myList;
    private int size;

    public MyList(){
        size = 0;
        myList = new Object[5];
    }

    @Override
    public T get(int index) {
        if(index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bound");
        }
        return (T)myList[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(T t){
        if(size >= myList.length){
            grow();
        }
        myList[size] = t;
        size++;
        return true;
    }

    @Override
    public T remove(int index) {
        if(index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bound");
        }
        T t = this.get(index);
        System.arraycopy(myList,index + 1, myList, index , myList.length - index - 1);
        this.size--;
        return t;
    }

    @Override
    public T set(int index, T element) {
        if(index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bound");
        }
        T t = (T) myList[index];
        myList[index] = element;
        return t;
    }

    @Override
    public void add(int index, T element) {
        if(index > size){
            throw new IndexOutOfBoundsException("Index is out of bound");
        }
        if(size >= myList.length){
          grow();
        }
        Object[] newList = new Object[myList.length];
        System.arraycopy(myList,0, newList, 0, index);
        newList[index] = element;
        System.arraycopy(myList, index, newList, index + 1, myList.length - index - 1);
        myList = newList;
        size++;
    }

    private void grow(){
        Object[] newList = new Object[myList.length + 10];
        System.arraycopy(myList,0, newList, 0, myList.length);
        myList = newList;
    }
}

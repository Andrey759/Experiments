package IteratorAndIterable;

import java.util.*;

public class IterableClass<E> implements Iterable<E> {

    private Object[] array;

    public IterableClass() {
        this.array = new Object[1];
        array[0] = new Integer(5);
    }

    public Object[] toArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(E[] array) {
        this.array = array;
    }


    public Iterator<E> iterator() {
        return null;
    }


}

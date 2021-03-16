package eu.senla;

import java.util.Collection;
import java.util.Comparator;
import java.util.ListIterator;

public class MyArrayList<E> implements  MyList<E> {

    private final int capacity = 16;
    private final int CUT_RATE = 2;
    private Object[] array = new Object[capacity];
    private int size = 0;
    // создает пустой список
    public MyArrayList(){
        this.array = new Object[capacity];
    }
    // создает список, который имеет начальную емкость capacity
    public MyArrayList(int capacity){
        if (capacity >= 0){
            this.array = new Object[capacity];
        }
        else {
            throw new IllegalStateException("Capacity can't be less than 0!");
        }
    }

    @Override
    public void add(int index, E obj) {
        if(index == array.length-1){
            Object[] newArray = new Object[array.length*CUT_RATE];
            for(index = 0; index< array.length-1; index++)
                newArray[index] = array[index];
            array = newArray; }
        Object[] boof =new Object[array.length];
        for (int i = index; i < array.length; i++)
            boof[i] = array[i];
        for (int i = 0; i < index; i++)
            array[index] = array[index];
        for (int i = index; i < array.length; i++)
            array[i]= boof[i-1];
        array[index] = obj;
        size++;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> col) {
        return false;
    }

    @Override
    public E get(int index) {
        return (E) array[index];
    }

    @Override
    public int indexOf(Object obj) {
        if (obj == null) {
            for (int i = 0; i < array.length; i++)
                if (array[i]==null)
                    return i;
        } else {
            for (int i = 0; i < array.length; i++)
                if (obj.equals(array[i]))
                    return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            for (int i = array.length-1; i >= 0; i--)
                if (array[i]==null)
                    return i;
        } else {
            for (int i = array.length-1; i >= 0; i--)
                if (obj.equals(array[i]))
                    return i;
        }
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public E remove(int index) {
        E oldValue = (E) array[index];
        int value = size - index - 1;
        if (value > 0){
            System.arraycopy(array, index+1, array, index, value);
        }
        array[--size] = null;
        return oldValue;
    }

    @Override
    public E set(int index, E obj) {
        array[index] = obj;
        return (E) array;
    }

    @Override
    public void sort(Comparator<? super E> comp) {

    }

    @Override
    public MyList<E> subList(int start, int end) {
        return null;
    }
}

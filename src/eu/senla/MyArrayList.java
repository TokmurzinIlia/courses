package eu.senla;

import java.util.*;

public class MyArrayList<E> implements MyList<E> {

    private final int CAPACITY = 16;
    private final int CUT_RATE = 2;
    private Object[] array = new Object[CAPACITY];
   // private static final Object[] EMPTY_ELEMENTDATA = {};
    private int size = 0;

    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    // создает пустой список
    public MyArrayList(){

        this.array = new Object[CAPACITY];

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
    // создает список, в который добавляются все элементы коллекции col
    MyArrayList(Collection<? extends E> col){
        array = col.toArray();
        size = array.length;

    };


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
        Object[] a = col.toArray();
        int numNew = array.length;
        int numMoved = size - index;
        if (numMoved > 0)
            System.arraycopy(array, index, array, index + numNew,
                    numMoved);

        System.arraycopy(a, 0, array, index, numNew);
        size += numNew;
        return numNew != 0;
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

        ListIterator<E> listIterator = new ListIterator<E>() {
            int cursor;       // index of next element to return
            int lastRet = -1; // index of last element returned; -1 if no such
            //int expectedModCount = modCount;
            @Override
            public boolean hasNext() {
                return cursor != size;
            }

            @Override
            public E next() {
                int i = cursor;
                Object[] array = MyArrayList.this.array;
                cursor = i + 1;
                return (E) array[lastRet = i];
            }


            @Override
            public boolean hasPrevious() {
                return cursor != 0;
            }

            @Override
            public E previous() {
                return null;
            }

            @Override
            public int nextIndex() {
                return 0;
            }

            @Override
            public int previousIndex() {
                return 0;
            }

            @Override
            public void remove() {

            }

            @Override
            public void set(E e) {

            }

            @Override
            public void add(E e) {

            }
        }
        return listIterator;
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
        Arrays.sort((E[]) array, 0, size, comp);
    }

    @Override
    public MyArrayList<E> subList(int start, int end) {
        MyArrayList<E> arrays = new MyArrayList();
        for (int i = start, j = 0; i <= end; i++, j++){
            arrays<E> = (E) array[i];
    }
        return arrays;
    }

}

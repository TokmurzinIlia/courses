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




    // создает список, который имеет начальную емкость capacity
    public MyArrayList(int capacity){
        if (capacity <= 0)
        try {
            throw new IllegalStateException("Размер массива не может быть равным ноль либо менее ноля");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
        if (capacity >= 0){
            this.array = new Object[capacity];
        }

    }



    @Override
    public void add(int index, E obj) {
        if(index > array.length-1)
            try{ throw new ArrayIndexOutOfBoundsException("Индекс больше размера массива");

           }catch (ArrayIndexOutOfBoundsException e){
        System.out.println(e.getMessage());
            }
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
            array[i]= boof[i];
        array[index] = obj;
        size++;
    }


    @Override
    public E get(int index) {
        if (index <= 0)
            try {
                throw new IllegalStateException("Индекс не может быть равным ноль либо менее ноля, поэтому Hello World");
            } finally {

                System.err.println("Hello World");
            }
        return (E) array[index];
    }



    }



package eu.senla;

import java.util.Collection;
import java.util.Comparator;
import java.util.ListIterator;

public interface MyList<E> {
    void add(int index, E obj);
    // добавляет в список по индексу index объект obj



    E get(int index);
    // возвращает объект из списка по индексу index



}
